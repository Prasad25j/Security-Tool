package com.example.service;

import org.springframework.stereotype.Service;
import com.example.dto.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SecurityGroupService {

    /**
     * Generates SQL INSERT queries for the entire security group hierarchy
     * without executing them. UUIDs are generated for all mapping table PKs.
     */
    public List<String> generateInsertQueries(SecurityGroupRequestDto request) {
        List<String> queries = new ArrayList<>();
        SecurityGroupDto sg = request.getSecurityGroup();

        // 1. Generate SecurityGroup INSERT
        String securityGroupGuid = generateGuid();
        queries.add(String.format(
            "INSERT INTO ASSECURITYGROUP (SECURITYGROUPGUID, GROUPNAME) VALUES ('%s', '%s');",
            securityGroupGuid, escapeSql(sg.getGroupName())
        ));

        // 2. Process each company
        if (sg.getCompanies() != null) {
            for (CompanyDto company : sg.getCompanies()) {
                String authCompanyGuid = generateGuid();
                queries.add(String.format(
                    "INSERT INTO ASAUTHCOMPANY (AUTHCOMPANYGUID, SECURITYGROUPGUID, COMPANYGUID) VALUES ('%s', '%s', '%s');",
                    authCompanyGuid, securityGroupGuid, escapeSql(company.getCompanyGuid())
                ));

                // 2a. Company Pages
                processCompanyPages(queries, authCompanyGuid, company.getCompanyPages());

                // 2b. Company Inquiries
                processCompanyInquiries(queries, authCompanyGuid, company.getCompanyInquiries());

                // 2c. Company Web Services
                processCompanyWebServices(queries, authCompanyGuid, company.getCompanyWebServices());

                // 2d. Products
                processProducts(queries, authCompanyGuid, company.getProducts());

                // 2e. Plans
                processPlans(queries, authCompanyGuid, company.getPlans());
            }
        }

        return queries;
    }

    // ==================== Company Pages ====================

    private void processCompanyPages(List<String> queries, String authCompanyGuid, List<CompanyPageDto> pages) {
        if (pages == null) return;
        for (CompanyPageDto page : pages) {
            String authCompanyPageGuid = generateGuid();
            queries.add(String.format(
                "INSERT INTO ASAUTHCOMPANYPAGE (AUTHCOMPANYPAGEGUID, AUTHCOMPANYGUID, AUTHPAGEGUID) VALUES ('%s', '%s', '%s');",
                authCompanyPageGuid, authCompanyGuid, escapeSql(page.getPageGuid())
            ));

            // Company Page Buttons
            if (page.getButtons() != null) {
                for (ButtonDto button : page.getButtons()) {
                    String authCompanyPageButtonGuid = generateGuid();
                    queries.add(String.format(
                        "INSERT INTO ASAUTHCOMPANYPAGEBUTTON (AUTHCOMPANYPAGEBUTTONGUID, AUTHCOMPANYPAGEGUID, AUTHBUTTONGUID) VALUES ('%s', '%s', '%s');",
                        authCompanyPageButtonGuid, authCompanyPageGuid, escapeSql(button.getButtonGuid())
                    ));
                }
            }
        }
    }

    // ==================== Company Inquiries ====================

    private void processCompanyInquiries(List<String> queries, String authCompanyGuid, List<CompanyInquiryDto> inquiries) {
        if (inquiries == null) return;
        for (CompanyInquiryDto inquiry : inquiries) {
            String authCompanyInquiryGuid = generateGuid();
            queries.add(String.format(
                "INSERT INTO ASAUTHCOMPANYINQUIRY (AUTHCOMPANYINQUIRYGUID, AUTHCOMPANYGUID, INQUIRYSCREENNAMEGUID) VALUES ('%s', '%s', '%s');",
                authCompanyInquiryGuid, authCompanyGuid, escapeSql(inquiry.getInquiryScreenNameGuid())
            ));
        }
    }

    // ==================== Company Web Services ====================

    private void processCompanyWebServices(List<String> queries, String authCompanyGuid, List<CompanyWebServiceDto> webServices) {
        if (webServices == null) return;
        for (CompanyWebServiceDto ws : webServices) {
            queries.add(String.format(
                "INSERT INTO ASAUTHCOMPANYWEBSERVICE (AUTHCOMPANYGUID, AUTHWEBSERVICEGUID) VALUES ('%s', '%s');",
                authCompanyGuid, escapeSql(ws.getWebServiceGuid())
            ));
        }
    }

    // ==================== Products ====================

    private void processProducts(List<String> queries, String authCompanyGuid, List<ProductDto> products) {
        if (products == null) return;
        for (ProductDto product : products) {
            String authProductGuid = generateGuid();
            queries.add(String.format(
                "INSERT INTO ASAUTHPRODUCT (AUTHPRODUCTGUID, AUTHCOMPANYGUID, PRODUCTGUID) VALUES ('%s', '%s', '%s');",
                authProductGuid, authCompanyGuid, escapeSql(product.getProductGuid())
            ));

            // Product Pages
            processProductPages(queries, authProductGuid, product.getProductPages());

            // Product Transactions
            processProductTransactions(queries, authProductGuid, product.getProductTransactions());
        }
    }

    private void processProductPages(List<String> queries, String authProductGuid, List<ProductPageDto> pages) {
        if (pages == null) return;
        for (ProductPageDto page : pages) {
            String authProductPageGuid = generateGuid();
            queries.add(String.format(
                "INSERT INTO ASAUTHPRODUCTPAGE (AUTHPRODUCTPAGEGUID, AUTHPRODUCTGUID, AUTHPAGEGUID) VALUES ('%s', '%s', '%s');",
                authProductPageGuid, authProductGuid, escapeSql(page.getPageGuid())
            ));

            // Product Page Buttons
            if (page.getButtons() != null) {
                for (ButtonDto button : page.getButtons()) {
                    String authProductPageButtonGuid = generateGuid();
                    queries.add(String.format(
                        "INSERT INTO ASAUTHPRODUCTPAGEBUTTON (AUTHPRODUCTPAGEBUTTONGUID, AUTHPRODUCTPAGEGUID, AUTHBUTTONGUID) VALUES ('%s', '%s', '%s');",
                        authProductPageButtonGuid, authProductPageGuid, escapeSql(button.getButtonGuid())
                    ));
                }
            }
        }
    }

    private void processProductTransactions(List<String> queries, String authProductGuid, List<ProductTransactionDto> transactions) {
        if (transactions == null) return;
        for (ProductTransactionDto txn : transactions) {
            String authProductTransactionGuid = generateGuid();
            queries.add(String.format(
                "INSERT INTO ASAUTHPRODUCTTRANSACTION (AUTHPRODUCTTRANSACTIONGUID, AUTHPRODUCTGUID, TRANSACTIONGUID) VALUES ('%s', '%s', '%s');",
                authProductTransactionGuid, authProductGuid, escapeSql(txn.getTransactionGuid())
            ));

            // Product Transaction Buttons
            if (txn.getButtons() != null) {
                for (ButtonDto button : txn.getButtons()) {
                    String authProductTransactionButtonGuid = generateGuid();
                    queries.add(String.format(
                        "INSERT INTO ASAUTHPRODUCTTRANSACTIONBUTTON (AUTHPRODUCTTRANSACTIONBUTTONGUID, AUTHPRODUCTTRANSACTIONGUID, AUTHBUTTONGUID) VALUES ('%s', '%s', '%s');",
                        authProductTransactionButtonGuid, authProductTransactionGuid, escapeSql(button.getButtonGuid())
                    ));
                }
            }
        }
    }

    // ==================== Plans ====================

    private void processPlans(List<String> queries, String authCompanyGuid, List<PlanDto> plans) {
        if (plans == null) return;
        for (PlanDto plan : plans) {
            String authPlanGuid = generateGuid();
            queries.add(String.format(
                "INSERT INTO ASAUTHPLAN (AUTHPLANGUID, AUTHCOMPANYGUID, PLANGUID) VALUES ('%s', '%s', '%s');",
                authPlanGuid, authCompanyGuid, escapeSql(plan.getPlanGuid())
            ));

            // Plan Pages
            processPlanPages(queries, authPlanGuid, plan.getPlanPages());

            // Plan Transactions
            processPlanTransactions(queries, authPlanGuid, plan.getPlanTransactions());
        }
    }

    private void processPlanPages(List<String> queries, String authPlanGuid, List<PlanPageDto> pages) {
        if (pages == null) return;
        for (PlanPageDto page : pages) {
            String authPlanPageGuid = generateGuid();
            queries.add(String.format(
                "INSERT INTO ASAUTHPLANPAGE (AUTHPLANPAGEGUID, AUTHPLANGUID, AUTHPAGEGUID) VALUES ('%s', '%s', '%s');",
                authPlanPageGuid, authPlanGuid, escapeSql(page.getPageGuid())
            ));

            // Plan Page Buttons
            if (page.getButtons() != null) {
                for (ButtonDto button : page.getButtons()) {
                    String authPlanPageButtonGuid = generateGuid();
                    queries.add(String.format(
                        "INSERT INTO ASAUTHPLANPAGEBUTTON (AUTHPLANPAGEBUTTONGUID, AUTHPLANPAGEGUID, AUTHBUTTONGUID) VALUES ('%s', '%s', '%s');",
                        authPlanPageButtonGuid, authPlanPageGuid, escapeSql(button.getButtonGuid())
                    ));
                }
            }
        }
    }

    private void processPlanTransactions(List<String> queries, String authPlanGuid, List<PlanTransactionDto> transactions) {
        if (transactions == null) return;
        for (PlanTransactionDto txn : transactions) {
            String authTransactionGuid = generateGuid();
            queries.add(String.format(
                "INSERT INTO ASAUTHTRANSACTION (AUTHTRANSACTIONGUID, AUTHPLANGUID, TRANSACTIONGUID) VALUES ('%s', '%s', '%s');",
                authTransactionGuid, authPlanGuid, escapeSql(txn.getTransactionGuid())
            ));

            // Plan Transaction Buttons
            if (txn.getButtons() != null) {
                for (ButtonDto button : txn.getButtons()) {
                    String authTransactionButtonGuid = generateGuid();
                    queries.add(String.format(
                        "INSERT INTO ASAUTHTRANSACTIONBUTTON (AUTHTRANSACTIONBUTTONGUID, AUTHTRANSACTIONGUID, AUTHBUTTONGUID) VALUES ('%s', '%s', '%s');",
                        authTransactionButtonGuid, authTransactionGuid, escapeSql(button.getButtonGuid())
                    ));
                }
            }
        }
    }

    // ==================== Utility Methods ====================

    /**
     * Generates an uppercase GUID without hyphens (matching OIPA convention).
     */
    private String generateGuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    /**
     * Escapes single quotes in SQL values to prevent SQL injection.
     */
    private String escapeSql(String value) {
        if (value == null) return "";
        return value.replace("'", "''");
    }
}
