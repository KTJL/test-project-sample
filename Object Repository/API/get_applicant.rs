<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>get_applicant</name>
   <tag></tag>
   <elementGuidId>7a4f19e2-19f8-4d27-b46a-231a0543f571</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOjIsImV4cCI6MTY3MDg2MjE1MSwibmJmIjoxNjcwNzc1NzUxLCJpYXQiOjE2NzA3NzU3NTF9.oh09ggzaCkV5bqprM70y1zMj0U003p4-utQGLMv8nyb1sWviK3nB7jXMxKsjhgL1Pnbzw6Yo_xlsuMpaFESMvQ</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;query\&quot;: \&quot;query{ appliedApplicants(programId: \\\&quot;0\\\&quot;){ id name email } }\&quot;\n}&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;displayText&quot;: &quot;query{\n\tappliedApplicants(programId: \&quot;0\&quot;){\n    \tid\n        name\n        email\n    }\n}&quot;,
  &quot;displayVariables&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;
}</httpBodyContent>
   <httpBodyType>GraphQL</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>5328d893-d7cd-4af3-be1c-ae7f623568b0</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOjIsImV4cCI6MTY3MDg2MjE1MSwibmJmIjoxNjcwNzc1NzUxLCJpYXQiOjE2NzA3NzU3NTF9.oh09ggzaCkV5bqprM70y1zMj0U003p4-utQGLMv8nyb1sWviK3nB7jXMxKsjhgL1Pnbzw6Yo_xlsuMpaFESMvQ</value>
      <webElementGuid>5d3c0b48-9c42-4695-b085-19b26e257976</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://ntnu.jw910731.me/query</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.programId</defaultValue>
      <description></description>
      <id>3e8c7993-861c-4b76-9e62-4e030f3ace82</id>
      <masked>false</masked>
      <name>programId</name>
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
WS.verifyElementPropertyValue(response, '', '')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
