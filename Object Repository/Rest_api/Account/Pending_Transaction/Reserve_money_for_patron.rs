<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Reserve_money_for_patron</name>
   <tag></tag>
   <elementGuidId>e9b168ce-4468-4aec-93d9-cfb2b72c1222</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;transactionType\&quot;: \&quot;CREDIT\&quot;,\n  \&quot;transactionTag\&quot;: \&quot;Credits\&quot;,\n  \&quot;fund\&quot;: {\n    \&quot;fundType\&quot;: \&quot;CASH\&quot;,\n    \&quot;value\&quot;: 50,\n    \&quot;currencyCode\&quot;: \&quot;USD\&quot;\n  },\n  \&quot;comment\&quot;: \&quot;Adding cash from Insomnia\&quot;,\n  \n  \&quot;caller\&quot;: {\n    \&quot;requestorName\&quot;: \&quot;UWS-API-Client\&quot;,\n    \&quot;requestorId\&quot;: \&quot;1\&quot;,\n    \&quot;initiatorName\&quot;: \&quot;Postman\&quot;,\n    \&quot;initiatorId\&quot;: \&quot;1\&quot;\n  }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Operator-Id</name>
      <type>Main</type>
      <value>C_CODE:P_CODE:admin</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJVU0VSLVJPTEVfQ1JFQVRFIiwiV0FMTEVULUFERF9FWFRFUk5BTF9XQUxMRVRfQllfUEFUUk9OIiwiV0FMTEVULVdBTExFVF9SRUFEX0FMTF9QRU5ESU5HX1RSQU5TQUNUSU9OUyIsIldBTExFVC1VV1NfVkVSU0lPTl9JTkZPIiwiVVNFUi1ST0xFU19SRUFEIiwiVVNFUi1VU0VSX01PRElGWSIsIldBTExFVC1XQUxMRVRfUkVBRF9QRU5ESU5HX1RSQU5TQUNUSU9OUyIsIlVTRVItVEFTS19HUk9VUF9ERUxFVEUiLCJXQUxMRVQtQ1JFRElUX1dBTExFVCIsIlJFUE9SVC1UUkFOU0FDVElPTlNfQllfQUNDT1VOVF9OVU1CRVJfUkVBRCIsIldBTExFVC1ERUJJVF9QQVRST04iLCJSRVBPUlQtVFJBTlNBQ1RJT05TX0JZX1RSQU5TQUNUSU9OX0JZX1RFUk1JTkFMX0lEX1JFQUQiLCJVU0VSLVBBU1NXT1JEX0NIQU5HRSIsIldBTExFVC1XQUxMRVRfVU5MT0NLIiwiV0FMTEVULVJFQURfRVhURVJOQUxfV0FMTEVUX0JZX1dBTExFVCIsIlJFUE9SVC1UUkFOU0FDVElPTlNfQllfUExBWUVSX0ZVTkRfQURKVVNUTUVOVF9SRUFEIiwiV0FMTEVULVdBTExFVF9UV09fUEhBU0VfSU5JVElBVEUiLCJVU0VSLVVTRVJfQ1JFQVRFIiwiV0FMTEVULVJFQURfV0FMTEVUUyIsIldBTExFVC1XQUxMRVRfTE9DSyIsIldBTExFVC1XQUxMRVRfUkVBRF9SRUZFUkVOQ0VfSUQiLCJXQUxMRVQtV0FMTEVUX1ZPSUQiLCJVU0VSLVVTRVJfUkVTRVRfUEFTU1dPUkQiLCJVU0VSLVJFQURfVEFTS19HUk9VUCIsIldBTExFVC1DUkVESVRfUEFUUk9OIiwiV0FMTEVULVBBVFJPTl9UV09fUEhBU0VfQ09NTUlUIiwiUkVQT1JULVRSQU5TQUNUSU9OU19CWV9TTE9UX1JFQUQiLCJXQUxMRVQtV0FMTEVUX1JFQURfVFJBTlNBQ1RJT05TIiwiV0FMTEVULVJFQURfRVhURVJOQUxfV0FMTEVUX0JZX1BBVFJPTiIsIlJFUE9SVC1UUkFOU0FDVElPTlNfQllfV0FMTEVUX0xJQUJJTElUWV9ERVRBSUxTX1JFQUQiLCJXQUxMRVQtUEFUUk9OX1JFQURfUEVORElOR19UUkFOU0FDVElPTlMiLCJXQUxMRVQtQ0xPU0VfV0FMTEVUIiwiQVVUSE9SSVpBVElPTi1DTElFTlRfUkVHSVNURVIiLCJXQUxMRVQtV0FMTEVUX0FESlVTVE1FTlRTIiwiV0FMTEVULUFERF9FWFRFUk5BTF9XQUxMRVRfQllfV0FMTEVUIiwiVVNFUi1UQVNLX0dST1VQX1JFQUQiLCJXQUxMRVQtREVCSVRfV0FMTEVUIiwiV0FMTEVULVBBVFJPTl9BREpVU1RNRU5UUyIsIldBTExFVC1MT0NLX1BBVFJPTiIsIldBTExFVC1SRUFEX1BBVFJPTiIsIlVTRVItVEFTS19HUk9VUF9DUkVBVEUiLCJXQUxMRVQtQ0xPU0VfUEFUUk9OIiwiV0FMTEVULVdBTExFVF9SRUFEX0FMTF9UUkFOU0FDVElPTlMiLCJXQUxMRVQtUkVNT1ZFX0VYVEVSTkFMX1dBTExFVF9CWV9XQUxMRVQiLCJXQUxMRVQtVU5MT0NLX1BBVFJPTiIsIlJFUE9SVC1UUkFOU0FDVElPTlNfQllfRVhURVJOQUxfV0FMTEVUX1RSQU5TRkVSX0RFVEFJTFNfUkVBRCIsIlVTRVItVVNFUl9ERUxFVEUiLCJVU0VSLVVTRVJfQ0hBTkdFX1NUQVRVUyIsIkFVVEhPUklaQVRJT04tQ0xJRU5UX1JFQUQiLCJBVVRIT1JJWkFUSU9OLUNMSUVOVF9ERUxFVEUiLCJXQUxMRVQtUEFUUk9OX1JFQURfVFJBTlNBQ1RJT05TIiwiV0FMTEVULVBBVFJPTl9UV09fUEhBU0VfSU5JVElBVEUiLCJVU0VSLVJPTEVfTU9ESUZZIiwiV0FMTEVULVJFQURfTElBQklMSVRJRVMiLCJXQUxMRVQtUkVBRF9XQUxMRVQiLCJXQUxMRVQtUEFUUk9OX1ZPSUQiLCJVU0VSLVJPTEVfREVMRVRFIiwiVVNFUi1VU0VSX1VOTE9DSyIsIldBTExFVC1XQUxMRVRfQ1JFQVRFIiwiQVVUSE9SSVpBVElPTi1DTElFTlRfRURJVCIsIlVTRVItVVNFUlNfUkVBRCIsIldBTExFVC1TV0FHR0VSIiwiV0FMTEVULVdBTExFVF9UV09fUEhBU0VfQ09NTUlUIiwiVVNFUi1UQVNLX0dST1VQX01PRElGWSJdLCJleHAiOjE1NjM4Njc2MjUsIk9wZXJhdG9yLUlkIjoiVVNBOlZlZ2FzOkVtcGxveWVlIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9HVUVTVFNfQVVUSE9SSVpFRF9DTElFTlQiXSwianRpIjoiYzkyMGJhOWYtZmQ4NS00ZDJkLWFkNjctN2FlMjY2NTUzOGE3IiwiY2xpZW50X2lkIjoiQWpheSJ9.lZ4rgBe5PkrzJgJrqHL-7pgAWhUGhOQiMtHWDvNx2aE</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>User-Agent</name>
      <type>Main</type>
      <value>PostmanRuntime/7.17.1</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>*/*</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Cache-Control</name>
      <type>Main</type>
      <value>no-cache</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Postman-Token</name>
      <type>Main</type>
      <value>b0d38873-e0f6-426f-9f22-4ef81627ac1a</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Host</name>
      <type>Main</type>
      <value>10.2.200.37:9000</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Encoding</name>
      <type>Main</type>
      <value>gzip, deflate</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Length</name>
      <type>Main</type>
      <value>403</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://10.2.200.37:9000/v1/wallets/patrons/0001/initiateTransfer</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
