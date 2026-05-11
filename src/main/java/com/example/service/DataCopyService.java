package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.*;
import com.example.primary.repository.*;
import com.example.secondary.repository.*;
import com.example.secondaryDev.repository.*;

@Service
public class DataCopyService {

    @Autowired
    private PrimaryRepository primaryRepository;
    @Autowired
    private SecondaryRepository secondaryRepository;
    @Autowired
    private SecondaryDevRepository secondaryDevRepository;



    @Autowired
    private AsPolicyFieldPrimaryRepository asPolicyFieldPrimaryRepository;
    @Autowired
    private AsPolicyFieldSecondaryRepository asPolicyFieldSecondaryRepository;
    @Autowired
    private AsPolicyFieldSecondaryDevRepository asPolicyFieldSecondaryDevRepository;



    @Autowired
    private AsPolicyMultiValueFieldPrimaryRepository asPolicyMultiValueFieldPrimaryRepository;
    @Autowired
    private AsPolicyMultiValueFieldSecondaryRepository asPolicyMultiValueFieldSecondaryRepository;
    @Autowired
    private AsPolicyMultiValueFieldSecondaryDevRepository asPolicyMultiValueFieldSecondaryDevRepository;


    @Autowired
    private AsSegmentPrimaryRepository asSegmentPrimaryRepository;
    @Autowired
    private AsSegmentSecondaryRepository asSegmentSecondaryRepository;
    @Autowired
    private AsSegmentSecondaryDevRepository asSegmentSecondaryDevRepository;


    @Autowired
    private AsSegmentFieldPrimaryRepository asSegmentFieldPrimaryRepository;
    @Autowired
    private AsSegmentFieldSecondaryRepository asSegmentFieldSecondaryRepository;
    @Autowired
    private AsSegmentFieldSecondaryDevRepository asSegmentFieldSecondaryDevRepository;


    @Autowired
    private AsSegmentMultiValueFieldPrimaryRepository asSegmentMultiValueFieldPrimaryRepository;
    @Autowired
    private AsSegmentMultiValueFieldSecondaryRepository asSegmentMultiValueFieldSecondaryRepository;
    @Autowired
    private AsSegmentMultiValueFieldSecondaryDevRepository asSegmentMultiValueFieldSecondaryDevRepository;


    @Autowired
    private AsRolePrimaryRepository asRolePrimaryRepository;
    @Autowired
    private AsRoleSecondaryRepository asRoleSecondaryRepository;
    @Autowired
    private AsRoleSecondaryDevRepository asRoleSecondaryDevRepository;

    @Autowired
    private AsRoleFieldPrimaryRepository asRoleFieldPrimaryRepository;
    @Autowired
    private AsRoleFieldSecondaryRepository asRoleFieldSecondaryRepository;
    @Autowired
    private AsRoleFieldSecondaryDevRepository asRoleFieldSecondaryDevRepository;


    @Autowired
    private AsClientPrimaryRepository asClientPrimaryRepository;
    @Autowired
    private AsClientSecondaryRepository asClientSecondaryRepository;
    @Autowired
    private AsClientSecondaryDevRepository asClientSecondaryDevRepository;


    @Autowired
    private AsClientFieldPrimaryRepository asClientFieldPrimaryRepository;
    @Autowired
    private AsClientFieldSecondaryRepository asClientFieldSecondaryRepository;
    @Autowired
    private AsClientFieldSecondaryDevRepository asClientFieldSecondaryDevRepository;


    @Autowired
    private AsClientMultiValueFieldPrimaryRepository asClientMultiValueFieldPrimaryRepository;
    @Autowired
    private AsClientMultiValueFieldSecondaryRepository asClientMultiValueFieldSecondaryRepository;
    @Autowired
    private AsClientMultiValueFieldSecondaryDevRepository asClientMultiValueFieldSecondaryDevRepository;


    @Autowired
    private AsAddressRolePrimaryRepository asAddressRolePrimaryRepository;
    @Autowired
    private AsAddressRoleSecondaryRepository asAddressRoleSecondaryRepository;
    @Autowired
    private AsAddressRoleSecondaryDevRepository asAddressRoleSecondaryDevRepository;


    @Autowired
    private AsAddressPrimaryRepository asAddressPrimaryRepository;
    @Autowired
    private AsAddressSecondaryRepository asAddressSecondaryRepository;
    @Autowired
    private AsAddressSecondaryDevRepository asAddressSecondaryDevRepository;


    @Autowired
    private AsAddressFieldPrimaryRepository asAddressFieldPrimaryRepository;
    @Autowired
    private AsAddressFieldSecondaryRepository asAddressFieldSecondaryRepository;
    @Autowired
    private AsAddressFieldSecondaryDevRepository asAddressFieldSecondaryDevRepository;


    @Autowired
    private AsAddressMultiValueFieldPrimaryRepository asAddressMultiValueFieldPrimaryRepository;
    @Autowired
    private AsAddressMultiValueFieldSecondaryRepository asAddressMultiValueFieldSecondaryRepository;
    @Autowired
    private AsAddressMultiValueFieldSecondaryDevRepository asAddressMultiValueFieldSecondaryDevRepository;

    
    @Autowired
    private AsAddressPhonePrimaryRepository asAddressPhonePrimaryRepository;
    @Autowired
    private AsAddressPhoneSecondaryRepository asAddressPhoneSecondaryRepository;
    @Autowired
    private AsAddressPhoneSecondaryDevRepository asAddressPhoneSecondaryDevRepository;

    @Autowired
    private AsClientPhonePrimaryRepository asClientPhonePrimaryRepository;
    @Autowired
    private AsClientPhoneSecondaryRepository asClientPhoneSecondaryRepository;
    @Autowired
    private AsClientPhoneSecondaryDevRepository asClientPhoneSecondaryDevRepository;


    @Autowired
    private AsPhonePrimaryRepository asPhonePrimaryRepository;
    @Autowired
    private AsPhoneSecondaryRepository asPhoneSecondaryRepository;
    @Autowired
    private AsPhoneSecondaryDevRepository asPhoneSecondaryDevRepository;

    @Autowired
    private AsActivityPrimaryRepository asActivityPrimaryRepository;
    @Autowired
    private AsActivitySecondaryRepository asActivitySecondaryRepository;
    @Autowired
    private AsActivitySecondaryDevRepository asActivitySecondaryDevRepository;

    
    @Autowired
    private AsActivityFieldPrimaryRepository asActivityFieldPrimaryRepository;
    @Autowired
    private AsActivityFieldSecondaryRepository asActivityFieldSecondaryRepository;
    @Autowired
    private AsActivityFieldSecondaryDevRepository asActivityFieldSecondaryDevRepository;

    
    @Autowired
    private AsActivityMultiValueFieldPrimaryRepository asActivityMultiValueFieldPrimaryRepository;
    @Autowired
    private AsActivityMultiValueFieldSecondaryRepository asActivityMultiValueFieldSecondaryRepository;
    @Autowired
    private AsActivityMultiValueFieldSecondaryDevRepository asActivityMultiValueFieldSecondaryDevRepository;

    
    
    @Autowired
    private AsActivitySpawnPrimaryRepository asActivitySpawnPrimaryRepository;
    @Autowired
    private AsActivitySpawnSecondaryRepository asActivitySpawnSecondaryRepository;
    @Autowired
    private AsActivitySpawnSecondaryDevRepository asActivitySpawnSecondaryDevRepository;

    
    @Autowired
    private AsActivityMathPrimaryRepository asActivityMathPrimaryRepository;
    @Autowired
    private AsActivityMathSecondaryRepository asActivityMathSecondaryRepository;
    @Autowired
    private AsActivityMathSecondaryDevRepository asActivityMathSecondaryDevRepository;

    
    @Autowired
    private AsRequirementPolicyPrimaryRepository asRequirementPolicyPrimaryRepository;
    @Autowired
    private AsRequirementPolicySecondaryRepository asRequirementPolicySecondaryRepository;
    @Autowired
    private AsRequirementPolicySecondaryDevRepository asRequirementPolicySecondaryDevRepository;

    
    @Autowired
    private AsRequirementPrimaryRepository asRequirementPrimaryRepository;
    @Autowired
    private AsRequirementSecondaryRepository asRequirementSecondaryRepository;
    @Autowired
    private AsRequirementSecondaryDevRepository asRequirementSecondaryDevRepository;

    
    @Autowired
    private AsRequirementActivityPrimaryRepository asRequirementActivityPrimaryRepository;
    @Autowired
    private AsRequirementActivitySecondaryRepository asRequirementActivitySecondaryRepository;
    @Autowired
    private AsRequirementActivitySecondaryDevRepository asRequirementActivitySecondaryDevRepository;

    
    @Autowired
    private AsRequirementClientPrimaryRepository asRequirementClientPrimaryRepository;
    @Autowired
    private AsRequirementClientSecondaryRepository asRequirementClientSecondaryRepository;
    @Autowired
    private AsRequirementClientSecondaryDevRepository asRequirementClientSecondaryDevRepository;

    
    @Autowired
    private AsRequirementFieldPrimaryRepository asRequirementFieldPrimaryRepository;
    @Autowired
    private AsRequirementFieldSecondaryRepository asRequirementFieldSecondaryRepository;
    @Autowired
    private AsRequirementFieldSecondaryDevRepository asRequirementFieldSecondaryDevRepository;

    
    @Autowired
    private AsSuspenseFieldPrimaryRepository asSuspenseFieldPrimaryRepository;
    @Autowired
    private AsSuspenseFieldSecondaryRepository asSuspenseFieldSecondaryRepository;
    @Autowired
    private AsSuspenseFieldSecondaryDevRepository asSuspenseFieldSecondaryDevRepository;

    
    @Autowired
    private AsSuspensePrimaryRepository asSuspensePrimaryRepository;
    @Autowired
    private AsSuspenseSecondaryRepository asSuspenseSecondaryRepository;
    @Autowired
    private AsSuspenseSecondaryDevRepository asSuspenseSecondaryDevRepository;
    
    @Autowired
    private AsValuationPrimaryRepository asValuationPrimaryRepository;
    @Autowired
    private AsValuationSecondaryRepository asValuationSecondaryRepository;
    @Autowired
    private AsValuationSecondaryDevRepository asValuationSecondaryDevRepository;

    @Autowired
    private AsValuationXmlPrimaryRepository asValuationXmlPrimaryRepository;
    @Autowired
    private AsValuationXmlSecondaryRepository asValuationXmlSecondaryRepository;
    @Autowired
    private AsValuationXmlSecondaryDevRepository asValuationXmlSecondaryDevRepository;
    
    @Autowired
    private AsAccountingDetailPrimaryRepository accountingDetailPrimaryRepository;
    @Autowired
    private AsAccountingDetailSecondaryRepository accountingDetailSecondaryRepository;
    @Autowired
    private AsAccountingDetailSecondaryDevRepository accountingDetailSecondaryDevRepository;

    @Autowired
    private AsAccountingDetailFieldPrimaryRepository asAccountingDetailFieldPrimaryRepository;
    @Autowired
    private AsAccountingDetailFieldSecondaryRepository accountingDetailFieldSecondaryRepository;
    @Autowired
    private AsAccountingDetailFieldSecondaryDevRepository accountingDetailFieldSecondaryDevRepository;







    @Transactional
  //  public void copyData(String policyGUID) {
    public void copyData(String policyNumber,String policyPrefix,String sourceEnv,String targetEnv) {
        List<AsPolicy> policies=new ArrayList<AsPolicy>();
    	try {
        // Step 1: Fetch data from the primary AsPolicy table based on the policy number
     //   List<AsPolicy> policies = primaryRepository.POLICYGUID(policyGUID);
          policies=new ArrayList<AsPolicy>();
            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                policies=new ArrayList<AsPolicy>();
                policies = primaryRepository.POLICYNUMBER(policyNumber);
            }else if (sourceEnv.equalsIgnoreCase("DEV2")){
                policies=new ArrayList<AsPolicy>();
                policies = secondaryRepository.POLICYNUMBER(policyNumber);
            }
        // Step 2: Insert data into the secondary AsPolicy table
        if (!policies.isEmpty()) {
            for (AsPolicy policy : policies) {
                // Create a new policy object
                AsPolicy newPolicy = new AsPolicy();

                // Copy existing values
                newPolicy.setPOLICYGUID(policy.getPOLICYGUID());
                newPolicy.setPOLICYNAME(policy.getPOLICYNAME());
                newPolicy.setCREATIONDATE(policy.getCREATIONDATE());
                newPolicy.setISSUESATATECODE(policy.getISSUESTATECODE());
                newPolicy.setPLANDATE(policy.getPLANDATE());
                newPolicy.setSTATUSCODE(policy.getSTATUSCODE());
                newPolicy.setCOMPANYGUID(policy.getCOMPANYGUID());
                newPolicy.setPLANGUID(policy.getPLANGUID());
                newPolicy.setXMLDATA(policy.getXMLDATA());
                newPolicy.setUPDATEDGMT(policy.getUPDATEDGMT());
                newPolicy.setSYSTEMCODE(policy.getSYSTEMCODE());

                // Override POLICYNUMBER (add "UA" prefix)
                newPolicy.setPOLICYNUMBER(policyPrefix + policy.getPOLICYNUMBER());

                // Save the new policy object
                if(targetEnv.equalsIgnoreCase("DEV2")) {
                    secondaryRepository.save(newPolicy);
                }else if (targetEnv.equalsIgnoreCase("DEV3")){
                    secondaryDevRepository.save(newPolicy);
                }
            }
        } else {
            throw new RuntimeException("No policies found with policy: " + policyNumber);
        }

        // Step 3: Extract POLICYGUIDs from the fetched policies
        List<String> policyGuids = policies.stream()
                .map(AsPolicy::getPOLICYGUID)
                .collect(Collectors.toList());

        // Step 4: Fetch and copy data from various tables based on POLICYGUID
        for (String policyGuid : policyGuids) { 
       
        
            // Copy AsPolicyField records
            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                List<AsPolicyField> policyFields = asPolicyFieldPrimaryRepository.findByIdPOLICYGUID(policyGuid);
                asPolicyFieldSecondaryRepository.saveAll(policyFields);
            }else if(sourceEnv.equalsIgnoreCase("DEV2")){
                List<AsPolicyField> policyFields = asPolicyFieldSecondaryRepository.findByIdPOLICYGUID(policyGuid);
                asPolicyFieldSecondaryDevRepository.saveAll(policyFields);
            }


            // Copy AsPolicyMultiValueField records
            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                List<AsPolicyMultiValueField> policyMultiValueFields = asPolicyMultiValueFieldPrimaryRepository.findByIdPOLICYGUID(policyGuid);
                asPolicyMultiValueFieldSecondaryRepository.saveAll(policyMultiValueFields);
            }else if(sourceEnv.equalsIgnoreCase("DEV2")){
                List<AsPolicyMultiValueField> policyMultiValueFields = asPolicyMultiValueFieldSecondaryRepository.findByIdPOLICYGUID(policyGuid);
                asPolicyMultiValueFieldSecondaryDevRepository.saveAll(policyMultiValueFields);
            }


            // Copy AsSegment records
            List<AsSegment> segments=new ArrayList<AsSegment>();
            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                segments=new ArrayList<AsSegment>();
                segments = asSegmentPrimaryRepository.findByPOLICYGUID(policyGuid);
                if (segments != null && !segments.isEmpty()) {
                    asSegmentSecondaryRepository.saveAll(segments);

                    // Copy AsSegmentField records
                    for (AsSegment segment : segments) {
                        List<AsSegmentField> segmentFields = asSegmentFieldPrimaryRepository.findByIdSEGMENTGUID(segment.getSEGMENTGUID());
                        asSegmentFieldSecondaryRepository.saveAll(segmentFields);

                        // Copy AsSegmentMultiValueField records
                        List<AsSegmentMultiValueField> segmentMultiValueFields = asSegmentMultiValueFieldPrimaryRepository.findByIdSEGMENTGUID(segment.getSEGMENTGUID());
                        asSegmentMultiValueFieldSecondaryRepository.saveAll(segmentMultiValueFields);
                    }
                }

            }else if(sourceEnv.equalsIgnoreCase("DEV2")){
                segments=new ArrayList<AsSegment>();
                segments = asSegmentSecondaryRepository.findByPOLICYGUID(policyGuid);
                if (segments != null && !segments.isEmpty()) {
                    asSegmentSecondaryDevRepository.saveAll(segments);

                    // Copy AsSegmentField records
                    for (AsSegment segment : segments) {
                        List<AsSegmentField> segmentFields = asSegmentFieldSecondaryRepository.findByIdSEGMENTGUID(segment.getSEGMENTGUID());
                        asSegmentFieldSecondaryDevRepository.saveAll(segmentFields);

                        // Copy AsSegmentMultiValueField records
                        List<AsSegmentMultiValueField> segmentMultiValueFields = asSegmentMultiValueFieldSecondaryRepository.findByIdSEGMENTGUID(segment.getSEGMENTGUID());
                        asSegmentMultiValueFieldSecondaryDevRepository.saveAll(segmentMultiValueFields);
                    }
                }
            }



            // Copy AsRole records
            List<AsRole> roles =new ArrayList<AsRole>();
            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                roles =new ArrayList<AsRole>();
                roles = asRolePrimaryRepository.findByPOLICYGUID(policyGuid);
                if (roles != null && !roles.isEmpty()) {
                    asRoleSecondaryRepository.saveAll(roles);

                    // Extract CLIENTGUIDs from the roles
                    List<String> clientGuids = roles.stream()
                            .map(AsRole::getCLIENTGUID)
                            .collect(Collectors.toList());

                    // Copy AsRoleField records for each role
                    for (AsRole role : roles) {
                        List<AsRoleField> roleFields = asRoleFieldPrimaryRepository.findByIdROLEGUID(role.getROLEGUID());
                        asRoleFieldSecondaryRepository.saveAll(roleFields);
                    }

                    // Copy AsClient records if CLIENTGUID matches
                    for (String clientGuid : clientGuids) {
                        List<AsClient> clients = asClientPrimaryRepository.findByCLIENTGUID(clientGuid);
                        if (clients != null && !clients.isEmpty()) {
                            asClientSecondaryRepository.saveAll(clients);

                            // Copy AsClientField records for each client
                            for (AsClient client : clients) {
                                List<AsClientField> clientFields = asClientFieldPrimaryRepository.findByIdCLIENTGUID(client.getCLIENTGUID());
                                if (clientFields != null && !clientFields.isEmpty()) {
                                    AsClient newClient = new AsClient();

                                    // Copy existing values
                                    newClient.setCLIENTGUID(client.getCLIENTGUID());
                                    newClient.setTYPECODE(client.getTYPECODE());
                                    newClient.setCOMPANYNAME(client.getCOMPANYNAME());
                                    newClient.setLASTNAME(client.getLASTNAME());
                                    newClient.setFIRSTNAME(client.getFIRSTNAME());
                                    newClient.setMIDDLEINITIAL(client.getMIDDLEINITIAL());
                                    newClient.setPREFIX(client.getPREFIX());
                                    newClient.setSUFFIX(client.getSUFFIX());
                                    newClient.setSEX(client.getSEX());
                                    newClient.setDATEOFBIRTH(client.getDATEOFBIRTH());
                                    newClient.setDATEOFDEATH(client.getDATEOFDEATH());
                                    newClient.setTAXID(client.getTAXID());
                                    newClient.setXMLDATA(client.getXMLDATA());
                                    newClient.setUPDATEDGMT(client.getUPDATEDGMT());
                                    newClient.setLEGALRESIDENCECOUNTRYCODE(client.getLEGALRESIDENCECOUNTRYCODE());
                                    newClient.setTITLE(client.getTITLE());
                                    newClient.setMARITALSTATUS(client.getMARITALSTATUS());
                                    newClient.setBIRTHCOUNTRYCODE(client.getBIRTHCOUNTRYCODE());
                                    newClient.setCITIZENSHIPCOUNTRYCODE(client.getCITIZENSHIPCOUNTRYCODE());
                                    newClient.setBIRTHREGIONCODE(client.getBIRTHREGIONCODE());
                                    newClient.setTEXTFIELD1(client.getTEXTFIELD1());
                                    newClient.setTEXTFIELD2(client.getTEXTFIELD2());
                                    newClient.setCHECKBOX1(client.getCHECKBOX1());
                                    newClient.setCHECKBOX2(client.getCHECKBOX2());
                                    newClient.setCOMBO2(client.getCOMBO2());
                                    newClient.setDATE1(client.getDATE1());
                                    newClient.setDATE2(client.getDATE2());
                                    newClient.setENTITYTYPECODE(client.getENTITYTYPECODE());
                                    newClient.setSTATUSCODE(client.getSTATUSCODE());

                                    // Override specific fields with hardcoded values
                                    newClient.setEMAIL("xyz123_noreply@pumail.test");
                                    newClient.setALTERNATENAME1("xyz123_noreply@pumail.test");
                                    newClient.setALTERNATENAME2("+999000111222");
                                    newClient.setPRIMARYPHONE("+999000111222");

                                    // Save the new client object
                                    asClientSecondaryRepository.save(newClient);
                                }

                                // Copy AsClientMultiValueField records for each client
                                List<AsClientMultiValueField> clientMultiValueFields = asClientMultiValueFieldPrimaryRepository.findByIdCLIENTGUID(client.getCLIENTGUID());
                                if (clientMultiValueFields != null && !clientMultiValueFields.isEmpty()) {
                                    asClientMultiValueFieldSecondaryRepository.saveAll(clientMultiValueFields);
                                }

                                // Copy AsAddressRole records if CLIENTGUID matches
                                List<AsAddressRole> addressRoles = asAddressRolePrimaryRepository.findByCLIENTGUID(client.getCLIENTGUID());
                                if (addressRoles != null && !addressRoles.isEmpty()) {
                                    asAddressRoleSecondaryRepository.saveAll(addressRoles);

                                    // Copy AsAddress records for each address role
                                    for (AsAddressRole addressRole : addressRoles) {
                                        List<AsAddress> addresses = asAddressPrimaryRepository.findByADDRESSGUID(addressRole.getADDRESSGUID());
                                        if (addresses != null && !addresses.isEmpty()) {
                                            asAddressSecondaryRepository.saveAll(addresses);

                                            // Copy AsAddressField records for each address
                                            List<AsAddressField> addressFields = asAddressFieldPrimaryRepository.findByIdADDRESSGUID(addressRole.getADDRESSGUID());
                                            if (addressFields != null && !addressFields.isEmpty()) {
                                                asAddressFieldSecondaryRepository.saveAll(addressFields);
                                            }

                                            // Copy AsAddressMultiValueField records for each address
                                            List<AsAddressMultiValueField> addressMultiValueFields = asAddressMultiValueFieldPrimaryRepository.findByIdADDRESSGUID(addressRole.getADDRESSGUID());
                                            if (addressMultiValueFields != null && !addressMultiValueFields.isEmpty()) {
                                                asAddressMultiValueFieldSecondaryRepository.saveAll(addressMultiValueFields);
                                            }

                                            // Copy AsAddressPhone records for each address
                                            List<AsAddressPhone> addressPhones = asAddressPhonePrimaryRepository.findByADDRESSGUID(addressRole.getADDRESSGUID());
                                            if (addressPhones != null && !addressPhones.isEmpty()) {
                                                asAddressPhoneSecondaryRepository.saveAll(addressPhones);
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        // Copy AsClientPhone records for each client
                        List<AsClientPhone> clientPhones = asClientPhonePrimaryRepository.findByCLIENTGUID(clientGuid);
                        if (clientPhones != null && !clientPhones.isEmpty()) {
                            asClientPhoneSecondaryRepository.saveAll(clientPhones);

                            // Copy AsPhone records for each phone number in AsClientPhone
                            for (AsClientPhone clientPhone : clientPhones) {
                                List<AsPhone> phones = asPhonePrimaryRepository.findByPHONENUMBERGUID(clientPhone.getPHONENUMBERGUID());
                                if (phones != null && !phones.isEmpty()) {
                                    asPhoneSecondaryRepository.saveAll(phones);
                                }
                            }
                        }
                    }
                }

            }else if(sourceEnv.equalsIgnoreCase("DEV2")){

                roles =new ArrayList<AsRole>();
                roles = asRoleSecondaryRepository.findByPOLICYGUID(policyGuid);
                if (roles != null && !roles.isEmpty()) {
                    asRoleSecondaryDevRepository.saveAll(roles);

                    // Extract CLIENTGUIDs from the roles
                    List<String> clientGuids = roles.stream()
                            .map(AsRole::getCLIENTGUID)
                            .collect(Collectors.toList());

                    // Copy AsRoleField records for each role
                    for (AsRole role : roles) {
                        List<AsRoleField> roleFields = asRoleFieldSecondaryRepository.findByIdROLEGUID(role.getROLEGUID());
                        asRoleFieldSecondaryDevRepository.saveAll(roleFields);
                    }

                    // Copy AsClient records if CLIENTGUID matches
                    for (String clientGuid : clientGuids) {
                        List<AsClient> clients = asClientSecondaryRepository.findByCLIENTGUID(clientGuid);
                        if (clients != null && !clients.isEmpty()) {
                            asClientSecondaryDevRepository.saveAll(clients);

                            // Copy AsClientField records for each client
                            for (AsClient client : clients) {
                                List<AsClientField> clientFields = asClientFieldSecondaryRepository.findByIdCLIENTGUID(client.getCLIENTGUID());
                                if (clientFields != null && !clientFields.isEmpty()) {
                                    AsClient newClient = new AsClient();

                                    // Copy existing values
                                    newClient.setCLIENTGUID(client.getCLIENTGUID());
                                    newClient.setTYPECODE(client.getTYPECODE());
                                    newClient.setCOMPANYNAME(client.getCOMPANYNAME());
                                    newClient.setLASTNAME(client.getLASTNAME());
                                    newClient.setFIRSTNAME(client.getFIRSTNAME());
                                    newClient.setMIDDLEINITIAL(client.getMIDDLEINITIAL());
                                    newClient.setPREFIX(client.getPREFIX());
                                    newClient.setSUFFIX(client.getSUFFIX());
                                    newClient.setSEX(client.getSEX());
                                    newClient.setDATEOFBIRTH(client.getDATEOFBIRTH());
                                    newClient.setDATEOFDEATH(client.getDATEOFDEATH());
                                    newClient.setTAXID(client.getTAXID());
                                    newClient.setXMLDATA(client.getXMLDATA());
                                    newClient.setUPDATEDGMT(client.getUPDATEDGMT());
                                    newClient.setLEGALRESIDENCECOUNTRYCODE(client.getLEGALRESIDENCECOUNTRYCODE());
                                    newClient.setTITLE(client.getTITLE());
                                    newClient.setMARITALSTATUS(client.getMARITALSTATUS());
                                    newClient.setBIRTHCOUNTRYCODE(client.getBIRTHCOUNTRYCODE());
                                    newClient.setCITIZENSHIPCOUNTRYCODE(client.getCITIZENSHIPCOUNTRYCODE());
                                    newClient.setBIRTHREGIONCODE(client.getBIRTHREGIONCODE());
                                    newClient.setTEXTFIELD1(client.getTEXTFIELD1());
                                    newClient.setTEXTFIELD2(client.getTEXTFIELD2());
                                    newClient.setCHECKBOX1(client.getCHECKBOX1());
                                    newClient.setCHECKBOX2(client.getCHECKBOX2());
                                    newClient.setCOMBO2(client.getCOMBO2());
                                    newClient.setDATE1(client.getDATE1());
                                    newClient.setDATE2(client.getDATE2());
                                    newClient.setENTITYTYPECODE(client.getENTITYTYPECODE());
                                    newClient.setSTATUSCODE(client.getSTATUSCODE());

                                    // Override specific fields with hardcoded values
                                    newClient.setEMAIL("xyz123_noreply@pumail.test");
                                    newClient.setALTERNATENAME1("xyz123_noreply@pumail.test");
                                    newClient.setALTERNATENAME2("+999000111222");
                                    newClient.setPRIMARYPHONE("+999000111222");

                                    // Save the new client object
                                    asClientSecondaryDevRepository.save(newClient);
                                }

                                // Copy AsClientMultiValueField records for each client
                                List<AsClientMultiValueField> clientMultiValueFields = asClientMultiValueFieldSecondaryRepository.findByIdCLIENTGUID(client.getCLIENTGUID());
                                if (clientMultiValueFields != null && !clientMultiValueFields.isEmpty()) {
                                    asClientMultiValueFieldSecondaryDevRepository.saveAll(clientMultiValueFields);
                                }

                                // Copy AsAddressRole records if CLIENTGUID matches
                                List<AsAddressRole> addressRoles = asAddressRoleSecondaryRepository.findByCLIENTGUID(client.getCLIENTGUID());
                                if (addressRoles != null && !addressRoles.isEmpty()) {
                                    asAddressRoleSecondaryDevRepository.saveAll(addressRoles);

                                    // Copy AsAddress records for each address role
                                    for (AsAddressRole addressRole : addressRoles) {
                                        List<AsAddress> addresses = asAddressSecondaryRepository.findByADDRESSGUID(addressRole.getADDRESSGUID());
                                        if (addresses != null && !addresses.isEmpty()) {
                                            asAddressSecondaryDevRepository.saveAll(addresses);

                                            // Copy AsAddressField records for each address
                                            List<AsAddressField> addressFields = asAddressFieldSecondaryRepository.findByIdADDRESSGUID(addressRole.getADDRESSGUID());
                                            if (addressFields != null && !addressFields.isEmpty()) {
                                                asAddressFieldSecondaryDevRepository.saveAll(addressFields);
                                            }

                                            // Copy AsAddressMultiValueField records for each address
                                            List<AsAddressMultiValueField> addressMultiValueFields = asAddressMultiValueFieldSecondaryRepository.findByIdADDRESSGUID(addressRole.getADDRESSGUID());
                                            if (addressMultiValueFields != null && !addressMultiValueFields.isEmpty()) {
                                                asAddressMultiValueFieldSecondaryDevRepository.saveAll(addressMultiValueFields);
                                            }

                                            // Copy AsAddressPhone records for each address
                                            List<AsAddressPhone> addressPhones = asAddressPhoneSecondaryRepository.findByADDRESSGUID(addressRole.getADDRESSGUID());
                                            if (addressPhones != null && !addressPhones.isEmpty()) {
                                                asAddressPhoneSecondaryDevRepository.saveAll(addressPhones);
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        // Copy AsClientPhone records for each client
                        List<AsClientPhone> clientPhones = asClientPhoneSecondaryRepository.findByCLIENTGUID(clientGuid);
                        if (clientPhones != null && !clientPhones.isEmpty()) {
                            asClientPhoneSecondaryDevRepository.saveAll(clientPhones);

                            // Copy AsPhone records for each phone number in AsClientPhone
                            for (AsClientPhone clientPhone : clientPhones) {
                                List<AsPhone> phones = asPhoneSecondaryRepository.findByPHONENUMBERGUID(clientPhone.getPHONENUMBERGUID());
                                if (phones != null && !phones.isEmpty()) {
                                    asPhoneSecondaryDevRepository.saveAll(phones);
                                }
                            }
                        }
                    }
                }

            }


            // Copy AsActivity records
            List<AsActivity> activities=new ArrayList<AsActivity>();
            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                activities=new ArrayList<AsActivity>();
              activities = asActivityPrimaryRepository.findByPOLICYGUID(policyGuid);
                if (activities != null && !activities.isEmpty()) {
                    asActivitySecondaryRepository.saveAll(activities);

                    // Copy AsActivityField records for each activity
                    for (AsActivity activity : activities) {
                        List<AsActivityField> activityFields = asActivityFieldPrimaryRepository.findByIdACTIVITYGUID(activity.getACTIVITYGUID());
                        if (activityFields != null && !activityFields.isEmpty()) {
                            asActivityFieldSecondaryRepository.saveAll(activityFields);
                        }

                        // Copy AsActivityMultiValueField records for each activity
                        List<AsActivityMultiValueField> activityMultiValueFields = asActivityMultiValueFieldPrimaryRepository.findByIdACTIVITYGUID(activity.getACTIVITYGUID());
                        if (activityMultiValueFields != null && !activityMultiValueFields.isEmpty()) {
                            asActivityMultiValueFieldSecondaryRepository.saveAll(activityMultiValueFields);
                        }

                        // Copy AsActivitySpawn records for each activity
                        List<AsActivitySpawn> activitySpawns = asActivitySpawnPrimaryRepository.findByIdACTIVITYGUID(activity.getACTIVITYGUID());
                        if (activitySpawns != null && !activitySpawns.isEmpty()) {
                            asActivitySpawnSecondaryRepository.saveAll(activitySpawns);
                        }

                        // Copy AsActivityMath records for each activity
                        List<AsActivityMath> activityMaths = asActivityMathPrimaryRepository.findByIdACTIVITYGUID(activity.getACTIVITYGUID());
                        if (activityMaths != null && !activityMaths.isEmpty()) {
                            asActivityMathSecondaryRepository.saveAll(activityMaths);
                        }
                    }
                }

            }else if(sourceEnv.equalsIgnoreCase("DEV2")){
                activities=new ArrayList<AsActivity>();
                activities = asActivitySecondaryRepository.findByPOLICYGUID(policyGuid);
                if (activities != null && !activities.isEmpty()) {
                    asActivitySecondaryDevRepository.saveAll(activities);

                    // Copy AsActivityField records for each activity
                    for (AsActivity activity : activities) {
                        List<AsActivityField> activityFields = asActivityFieldSecondaryRepository.findByIdACTIVITYGUID(activity.getACTIVITYGUID());
                        if (activityFields != null && !activityFields.isEmpty()) {
                            asActivityFieldSecondaryDevRepository.saveAll(activityFields);
                        }

                        // Copy AsActivityMultiValueField records for each activity
                        List<AsActivityMultiValueField> activityMultiValueFields = asActivityMultiValueFieldSecondaryRepository.findByIdACTIVITYGUID(activity.getACTIVITYGUID());
                        if (activityMultiValueFields != null && !activityMultiValueFields.isEmpty()) {
                            asActivityMultiValueFieldSecondaryDevRepository.saveAll(activityMultiValueFields);
                        }

                        // Copy AsActivitySpawn records for each activity
                        List<AsActivitySpawn> activitySpawns = asActivitySpawnSecondaryRepository.findByIdACTIVITYGUID(activity.getACTIVITYGUID());
                        if (activitySpawns != null && !activitySpawns.isEmpty()) {
                            asActivitySpawnSecondaryDevRepository.saveAll(activitySpawns);
                        }

                        // Copy AsActivityMath records for each activity
                        List<AsActivityMath> activityMaths = asActivityMathSecondaryRepository.findByIdACTIVITYGUID(activity.getACTIVITYGUID());
                        if (activityMaths != null && !activityMaths.isEmpty()) {
                            asActivityMathSecondaryDevRepository.saveAll(activityMaths);
                        }
                    }
                }

            }



            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                List<AsRequirementPolicy> requirementPolicies = asRequirementPolicyPrimaryRepository.findByIdPOLICYGUID(policyGuid);
                if (requirementPolicies != null && !requirementPolicies.isEmpty()) {
                    asRequirementPolicySecondaryRepository.saveAll(requirementPolicies);

                    // Extract REQUIREMENTGUIDs from the fetched requirement policies
                    List<String> requirementGuids = requirementPolicies.stream()
                            .map(reqPolicy -> reqPolicy.getId().getREQUIREMENTGUID())
                            .collect(Collectors.toList());

                    // Step 6: Fetch and copy data from AsRequirement table based on REQUIREMENTGUID
                    for (String requirementGuid : requirementGuids) {
                        List<AsRequirement> requirements = asRequirementPrimaryRepository.findByREQUIREMENTGUID(requirementGuid);
                        if (requirements != null && !requirements.isEmpty()) {
                            asRequirementSecondaryRepository.saveAll(requirements);
                        }
                        // copy AsRequirementActivity
                        List<AsRequirementActivity> ractivities = asRequirementActivityPrimaryRepository.findByIdREQUIREMENTGUID(requirementGuid);
                        if (ractivities != null && !ractivities.isEmpty()) {
                            asRequirementActivitySecondaryRepository.saveAll(ractivities);
                        }

                        List<AsRequirementClient> requirementClients = asRequirementClientPrimaryRepository.findByIdREQUIREMENTGUID(requirementGuid);
                        if (requirementClients != null && !requirementClients.isEmpty()) {
                            asRequirementClientSecondaryRepository.saveAll(requirementClients);
                        }

                        List<AsRequirementField> requirementFields = asRequirementFieldPrimaryRepository.findByIdREQUIREMENTGUID(requirementGuid);
                        if (requirementFields != null && !requirementFields.isEmpty()) {
                            asRequirementFieldSecondaryRepository.saveAll(requirementFields);
                        }

                    }
                }

            }else if(sourceEnv.equalsIgnoreCase("DEV2")){
                List<AsRequirementPolicy> requirementPolicies = asRequirementPolicySecondaryRepository.findByIdPOLICYGUID(policyGuid);
                if (requirementPolicies != null && !requirementPolicies.isEmpty()) {
                    asRequirementPolicySecondaryDevRepository.saveAll(requirementPolicies);

                    // Extract REQUIREMENTGUIDs from the fetched requirement policies
                    List<String> requirementGuids = requirementPolicies.stream()
                            .map(reqPolicy -> reqPolicy.getId().getREQUIREMENTGUID())
                            .collect(Collectors.toList());

                    // Step 6: Fetch and copy data from AsRequirement table based on REQUIREMENTGUID
                    for (String requirementGuid : requirementGuids) {
                        List<AsRequirement> requirements = asRequirementSecondaryRepository.findByREQUIREMENTGUID(requirementGuid);
                        if (requirements != null && !requirements.isEmpty()) {
                            asRequirementSecondaryDevRepository.saveAll(requirements);
                        }
                        // copy AsRequirementActivity
                        List<AsRequirementActivity> ractivities = asRequirementActivitySecondaryRepository.findByIdREQUIREMENTGUID(requirementGuid);
                        if (ractivities != null && !ractivities.isEmpty()) {
                            asRequirementActivitySecondaryDevRepository.saveAll(ractivities);
                        }

                        List<AsRequirementClient> requirementClients = asRequirementClientSecondaryRepository.findByIdREQUIREMENTGUID(requirementGuid);
                        if (requirementClients != null && !requirementClients.isEmpty()) {
                            asRequirementClientSecondaryDevRepository.saveAll(requirementClients);
                        }

                        List<AsRequirementField> requirementFields = asRequirementFieldSecondaryRepository.findByIdREQUIREMENTGUID(requirementGuid);
                        if (requirementFields != null && !requirementFields.isEmpty()) {
                            asRequirementFieldSecondaryDevRepository.saveAll(requirementFields);
                        }

                    }
                }
            }





            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                // SELECT * FROM Assuspense where policynumber='10022';
                List<AsSuspense> suspensePrimaryList= asSuspensePrimaryRepository.findBypolicyNumber(policyNumber);
                if(!suspensePrimaryList.isEmpty() && suspensePrimaryList!=null) {

                    List<AsSuspense> newSuspenseList= new ArrayList<AsSuspense>();
                    for (AsSuspense suspense : suspensePrimaryList) {

                        AsSuspense newsuspense =new AsSuspense();
                        newsuspense.setSuspenseGuid(suspense.getSuspenseGuid());
                        newsuspense.setSuspenseNumber(suspense.getSuspenseNumber());
                        newsuspense.setTypeCode(suspense.getTypeCode());
                        newsuspense.setStatusCode(suspense.getStatusCode());
                        newsuspense.setAmount(suspense.getAmount());
                        newsuspense.setAttachedAmount(suspense.getAttachedAmount());
                        newsuspense.setCompanyGuid(suspense.getCompanyGuid());
                        newsuspense.setPolicyNumber(policyPrefix + suspense.getPolicyNumber());
                        newsuspense.setEffectiveDate(suspense.getEffectiveDate());
                        newsuspense.setEffectiveFromDate(suspense.getEffectiveFromDate());
                        newsuspense.setEffectiveToDate(suspense.getEffectiveToDate());
                        newsuspense.setClientNumber(suspense.getClientNumber());
                        newsuspense.setFirstName(suspense.getFirstName());
                        newsuspense.setLastName(suspense.getLastName());
                        newsuspense.setAccountNumber(suspense.getAccountNumber());
                        newsuspense.setBankName(suspense.getBankName());
                        newsuspense.setBankNumber(suspense.getBankNumber());
                        newsuspense.setCheckNumber(suspense.getCheckNumber());
                        newsuspense.setXmlData(suspense.getXmlData());
                        newsuspense.setBatchNumber(suspense.getBatchNumber());
                        newsuspense.setCurrencyCode(suspense.getCurrencyCode());
                        newsuspense.setUpdatedGmt(suspense.getUpdatedGmt());

                        //newSuspenseList.add(newsuspense);
                        // add the new Assuspense object
                        asSuspenseSecondaryRepository.save(newsuspense);

                        // SELECT * FROM AssuspenseField where suspenseguid in (SELECT suspenseguid FROM Assuspense where policynumber='10022');

                        List<AsSuspenseField>  asSuspenseFieldList = asSuspenseFieldPrimaryRepository.findByIdSuspenseGuid(suspense.getSuspenseGuid());
                        if (asSuspenseFieldList!=null && !asSuspenseFieldList.isEmpty()) {
                            asSuspenseFieldSecondaryRepository.saveAll(asSuspenseFieldList);
                        }
                    }
                }
            }else if(sourceEnv.equalsIgnoreCase("DEV2")){
                // SELECT * FROM Assuspense where policynumber='10022';
                List<AsSuspense> suspensePrimaryList= asSuspenseSecondaryRepository.findBypolicyNumber(policyNumber);
                if(!suspensePrimaryList.isEmpty() && suspensePrimaryList!=null) {

                    List<AsSuspense> newSuspenseList= new ArrayList<AsSuspense>();
                    for (AsSuspense suspense : suspensePrimaryList) {

                        AsSuspense newsuspense =new AsSuspense();
                        newsuspense.setSuspenseGuid(suspense.getSuspenseGuid());
                        newsuspense.setSuspenseNumber(suspense.getSuspenseNumber());
                        newsuspense.setTypeCode(suspense.getTypeCode());
                        newsuspense.setStatusCode(suspense.getStatusCode());
                        newsuspense.setAmount(suspense.getAmount());
                        newsuspense.setAttachedAmount(suspense.getAttachedAmount());
                        newsuspense.setCompanyGuid(suspense.getCompanyGuid());
                        newsuspense.setPolicyNumber(policyPrefix + suspense.getPolicyNumber());
                        newsuspense.setEffectiveDate(suspense.getEffectiveDate());
                        newsuspense.setEffectiveFromDate(suspense.getEffectiveFromDate());
                        newsuspense.setEffectiveToDate(suspense.getEffectiveToDate());
                        newsuspense.setClientNumber(suspense.getClientNumber());
                        newsuspense.setFirstName(suspense.getFirstName());
                        newsuspense.setLastName(suspense.getLastName());
                        newsuspense.setAccountNumber(suspense.getAccountNumber());
                        newsuspense.setBankName(suspense.getBankName());
                        newsuspense.setBankNumber(suspense.getBankNumber());
                        newsuspense.setCheckNumber(suspense.getCheckNumber());
                        newsuspense.setXmlData(suspense.getXmlData());
                        newsuspense.setBatchNumber(suspense.getBatchNumber());
                        newsuspense.setCurrencyCode(suspense.getCurrencyCode());
                        newsuspense.setUpdatedGmt(suspense.getUpdatedGmt());

                        //newSuspenseList.add(newsuspense);
                        // add the new Assuspense object
                        asSuspenseSecondaryDevRepository.save(newsuspense);

                        // SELECT * FROM AssuspenseField where suspenseguid in (SELECT suspenseguid FROM Assuspense where policynumber='10022');

                        List<AsSuspenseField>  asSuspenseFieldList = asSuspenseFieldSecondaryRepository.findByIdSuspenseGuid(suspense.getSuspenseGuid());
                        if (asSuspenseFieldList!=null && !asSuspenseFieldList.isEmpty()) {
                            asSuspenseFieldSecondaryDevRepository.saveAll(asSuspenseFieldList);
                        }
                    }
                }

            }  //end
            
          

           
            //select * from asvaluation where policyguid='0CA46C10-D966-41E0-BFC9-8CE9B07F98C2' and 
          //  activityguid in (select activityguid from asactivity  where policyguid='0CA46C10-D966-41E0-BFC9-8CE9B07F98C2');

            if(sourceEnv.equalsIgnoreCase("DEV1")) {
                List<String> activityGuidList = activities.stream()
                        .map(AsActivity::getACTIVITYGUID)
                        .collect(Collectors.toList());
                if (activityGuidList!=null && !activityGuidList.isEmpty()) {
                    List<AsValuation> valuationList= asValuationPrimaryRepository.findByPolicyGuidAndActivityGuidIn(policyGuid, activityGuidList);
                    if(valuationList!=null && !valuationList.isEmpty()) {
                        asValuationSecondaryRepository.saveAll(valuationList);
                    }
//
                    //select * from asvaluationxml where activityguid
                    //  in (select activityguid from asactivity  where policyguid='0CA46C10-D966-41E0-BFC9-8CE9B07F98C2');

                    List<AsValuationXml> asValuationXmlsList= asValuationXmlPrimaryRepository.findByactivityGuidIn(activityGuidList);
                    if(asValuationXmlsList!=null && !asValuationXmlsList.isEmpty()) {
                        asValuationXmlSecondaryRepository.saveAll(asValuationXmlsList);
                    }


                    //select * from AsaccountingDetail  where activityguid
                    //   in (select activityguid from asactivity  where policyguid='0CA46C10-D966-41E0-BFC9-8CE9B07F98C2');


                    List<AsAccountingDetail> accountingDetailsList=accountingDetailPrimaryRepository.findByactivityGuidIn(activityGuidList);
                    List<AsAccountingDetail> asAccountingSecondayList=new ArrayList<AsAccountingDetail>();

                    if(accountingDetailsList!=null && !accountingDetailsList.isEmpty()) {
                        asAccountingSecondayList=  accountingDetailSecondaryRepository.saveAll(accountingDetailsList);
                    }


                    //select * from asaccountingdetailfield where accountingdetailguid in (select accountingdetailguid from AsaccountingDetail  where activityguid
                    // in (select activityguid from asactivity  where policyguid='0CA46C10-D966-41E0-BFC9-8CE9B07F98C2'));


                    if(asAccountingSecondayList!=null && !asAccountingSecondayList.isEmpty()) {

                        List<String> accountingSecondayGuidList = asAccountingSecondayList.stream()
                                .map(AsAccountingDetail::getAccountingDetailGuid)
                                .collect(Collectors.toList());

                        if(accountingSecondayGuidList!=null && !accountingSecondayGuidList.isEmpty()) {
                            List<AsAccountingDetailField> asAccountingDetailFieldsList=
                                    asAccountingDetailFieldPrimaryRepository.findByIdAccountingDetailGuidIn(accountingSecondayGuidList);

                            if(asAccountingDetailFieldsList!=null && !asAccountingDetailFieldsList.isEmpty()) {
                                accountingDetailFieldSecondaryRepository.saveAll(asAccountingDetailFieldsList);
                            }
                        }}


                }
            }else if(sourceEnv.equalsIgnoreCase("DEV2")){

                List<String> activityGuidList = activities.stream()
                        .map(AsActivity::getACTIVITYGUID)
                        .collect(Collectors.toList());
                if (activityGuidList!=null && !activityGuidList.isEmpty()) {
                    List<AsValuation> valuationList= asValuationSecondaryRepository.findByPolicyGuidAndActivityGuidIn(policyGuid, activityGuidList);
                    if(valuationList!=null && !valuationList.isEmpty()) {
                        asValuationSecondaryDevRepository.saveAll(valuationList);
                    }
//
                    //select * from asvaluationxml where activityguid
                    //  in (select activityguid from asactivity  where policyguid='0CA46C10-D966-41E0-BFC9-8CE9B07F98C2');

                    List<AsValuationXml> asValuationXmlsList= asValuationXmlSecondaryRepository.findByactivityGuidIn(activityGuidList);
                    if(asValuationXmlsList!=null && !asValuationXmlsList.isEmpty()) {
                        asValuationXmlSecondaryDevRepository.saveAll(asValuationXmlsList);
                    }


                    //select * from AsaccountingDetail  where activityguid
                    //   in (select activityguid from asactivity  where policyguid='0CA46C10-D966-41E0-BFC9-8CE9B07F98C2');


                    List<AsAccountingDetail> accountingDetailsList=accountingDetailSecondaryRepository.findByactivityGuidIn(activityGuidList);
                    List<AsAccountingDetail> asAccountingSecondayList=new ArrayList<AsAccountingDetail>();

                    if(accountingDetailsList!=null && !accountingDetailsList.isEmpty()) {
                        asAccountingSecondayList=  accountingDetailSecondaryDevRepository.saveAll(accountingDetailsList);
                    }


                    //select * from asaccountingdetailfield where accountingdetailguid in (select accountingdetailguid from AsaccountingDetail  where activityguid
                    // in (select activityguid from asactivity  where policyguid='0CA46C10-D966-41E0-BFC9-8CE9B07F98C2'));


                    if(asAccountingSecondayList!=null && !asAccountingSecondayList.isEmpty()) {

                        List<String> accountingSecondayGuidList = asAccountingSecondayList.stream()
                                .map(AsAccountingDetail::getAccountingDetailGuid)
                                .collect(Collectors.toList());

                        if(accountingSecondayGuidList!=null && !accountingSecondayGuidList.isEmpty()) {
                            List<AsAccountingDetailField> asAccountingDetailFieldsList=
                                    accountingDetailFieldSecondaryRepository.findByIdAccountingDetailGuidIn(accountingSecondayGuidList);

                            if(asAccountingDetailFieldsList!=null && !asAccountingDetailFieldsList.isEmpty()) {
                                accountingDetailFieldSecondaryDevRepository.saveAll(asAccountingDetailFieldsList);
                            }
                        }}


                }

            }



            
         
          
          
            
        }
    }catch(Throwable t) {
    	t.printStackTrace();
    }
    }    	
}
