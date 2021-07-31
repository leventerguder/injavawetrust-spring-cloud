https://learn.hashicorp.com/collections/vault/getting-started

To start vault server on command line.
vault server -dev

open new command line ;

export VAULT_ADDR='http://127.0.0.1:8200'
export VAULT_TOKEN=s.TmH8SHJWnP8LWeIUTrvHOIKH
vault kv put secret/config-client-vault/dev example.key1=example-value1-dev
vault kv put secret/config-client-vault/uat example.key1=example-value1-uat

- You can find the VAULT_TOKEN on command line (the first one)
- (2 - export vault and add properties.png)

config-client-vault#boostrap.yml
we need to add The Root token/VAULT_TOKEN (check 1 - vault server -dev.png)

