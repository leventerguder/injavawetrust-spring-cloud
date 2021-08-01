The symmetric encryption key is nothing more than a shared secret that's used by the
encrypter to encrypt a value and by the decrypter to decrypt a value.


When you fire up your Spring Cloud Config instance, Spring Cloud Config detects that the ENCRYPT_KEY environment 
variable or the bootstrap file property is set, 
and automatically adds two new endpoints, /encrypt and /decrypt to the Spring Cloud Config service.

When you call the /encrypt or /decrypt endpoints, you need to make sure you do a POST to these endpoints.
