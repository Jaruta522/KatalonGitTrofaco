<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create_Customer_Backend</name>
   <tag></tag>
   <elementGuidId>250fab38-6a79-46ff-be93-08398c684280</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;code\&quot;: \&quot;${CustomerCode}\&quot;,\n  \&quot;name\&quot;: \&quot;${CustomerName}\&quot;,\n  \&quot;customerType\&quot;: ${CustomerTypeCreated},\n  \&quot;country\&quot;: \&quot;Thailand\&quot;,\n  \&quot;region\&quot;: \&quot;Thai\&quot;\n}&quot;,
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
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic c3VwZXJhZG1pbkBtYW5hb3Rlc3QuY29tOk1hbmFvMTAwJQ==</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://trofaco-dev.manaoweb.company.manaosoftware.com/api/v1/customers/create-customer</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.CustomerName</defaultValue>
      <description></description>
      <id>ab07d110-c689-4d3b-8997-595a3ddbfee8</id>
      <masked>false</masked>
      <name>CustomerName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CustomerCode</defaultValue>
      <description></description>
      <id>639f2be5-cc13-41f8-a2b5-0a8a0299db16</id>
      <masked>false</masked>
      <name>CustomerCode</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CustomerTypeCreated</defaultValue>
      <description></description>
      <id>453ebf23-992f-45ff-9e79-a60339a980ca</id>
      <masked>false</masked>
      <name>CustomerTypeCreated</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()



WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

WS.verifyElementPropertyValue(response, 'errors', 'null')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
