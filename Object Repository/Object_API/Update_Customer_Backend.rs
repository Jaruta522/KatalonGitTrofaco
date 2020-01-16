<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update_Customer_Backend</name>
   <tag></tag>
   <elementGuidId>7ff650a7-b96b-44e0-826d-e0ff0f7edc52</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: \&quot;${CustomerId}\&quot;,\n  \&quot;code\&quot;: \&quot;${CustomerCode}\&quot;,\n  \&quot;name\&quot;: \&quot;${CustomerNameChanged}\&quot;,\n  \&quot;country\&quot;: \&quot;Thailand\&quot;,\n  \&quot;logo\&quot;: null,\n  \&quot;customerType\&quot;: \&quot;2\&quot;,\n  \&quot;certificates\&quot;: []\n}&quot;,
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
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>http://trofaco-dev.manaoweb/api/v1/customers/update-customer</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.CustIdForUpdate</defaultValue>
      <description></description>
      <id>322ff3e7-efa6-4781-8555-b217159329f8</id>
      <masked>false</masked>
      <name>CustomerId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CustomerCode</defaultValue>
      <description></description>
      <id>ce1c398a-8599-41d6-8be1-c1791482712c</id>
      <masked>false</masked>
      <name>CustomerCode</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CustomerNameChanged</defaultValue>
      <description></description>
      <id>0c9705b1-3344-4750-a4a9-2ab0bea56909</id>
      <masked>false</masked>
      <name>CustomerNameChanged</name>
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

WS.verifyElementPropertyValue(response, 'errors', '[]')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
