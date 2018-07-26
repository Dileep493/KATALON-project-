<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>New Request1</name>
   <tag></tag>
   <elementGuidId>a00c3582-58e8-469c-94db-7ae54a73d479</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://www.thomas-bayer.com/sqlrest/CUSTOMER/11</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assertThat(response.getResponseText()).contains('Katalon Test Project')

def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseText())

assertThat(response.getResponseText()).isEqualTo(&quot;Katalon Test Project&quot;)

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

String[] arrayResponse = [&quot;why&quot;, &quot;hello&quot;, &quot;there&quot;]
String[] arrayExpect = [&quot;there&quot;, &quot;why&quot;, &quot;hello&quot;]
assertThat(arrayResponse).containsOnly(&quot;there&quot;, &quot;hello&quot;, &quot;why&quot;)
assertThat(arrayResponse).containsOnlyElementsOf(Arrays.asList(&quot;why&quot;, &quot;there&quot;, &quot;hello&quot;))

assertThat(arrayResponse).containsExactly(&quot;why&quot;, &quot;hello&quot;, &quot;there&quot;)
assertThat(arrayResponse).containsExactlyElementsOf(Arrays.asList(&quot;why&quot;, &quot;hello&quot;, &quot;there&quot;))

assertThat(arrayResponse).containsSequence(&quot;why&quot;, &quot;hello&quot;)
assertThat(arrayResponse).containsSubsequence(&quot;why&quot;, &quot;there&quot;)
assertThat(arrayResponse).containsAnyOf(&quot;why&quot;, &quot;nothing&quot;, &quot;new&quot;)

assertThat(arrayResponse).contains(&quot;hello&quot;, atIndex(1))
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
