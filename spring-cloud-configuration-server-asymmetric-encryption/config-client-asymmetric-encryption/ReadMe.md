keytool -genkeypair -alias injavawetrustEncryptionKey -keyalg RSA \
-dname "CN=Levent Erguder ,OU=Unit,O=injavawetrust,L=Tuzla,S=Istanbul,C=Turkey" \
-keypass a12345 -keystore injavawetrustEncryptionKey.jks -storepass a12345
