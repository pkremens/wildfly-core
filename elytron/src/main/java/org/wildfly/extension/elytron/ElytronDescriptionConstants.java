/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wildfly.extension.elytron;

/**
 * Constants used in the Elytron subsystem.
 *
 * @author <a href="mailto:darran.lofthouse@jboss.com">Darran Lofthouse</a>
 */
interface ElytronDescriptionConstants {

    String ACTION = "action";
    String ACTIVE_SESSION_COUNT = "active-session-count";
    String ADD_ATTRIBUTE = "add-attribute";
    String ADD_PREFIX_ROLE_MAPPER = "add-prefix-role-mapper";
    String ADD_SUFFIX_ROLE_MAPPER = "add-suffix-role-mapper";
    String AGGREGATE_HTTP_SERVER_MECHANISM_FACTORY = "aggregate-http-server-mechanism-factory";
    String AGGREGATE_PRINCIPAL_DECODER = "aggregate-principal-decoder";
    String AGGREGATE_PRINCIPAL_TRANSFORMER = "aggregate-principal-transformer";
    String AGGREGATE_PROVIDERS = "aggregate-providers";
    String AGGREGATE_REALM = "aggregate-realm";
    String AGGREGATE_ROLE_MAPPER = "aggregate-role-mapper";
    String AGGREGATE_SASL_SERVER_FACTORY = "aggregate-sasl-server-factory";
    String AGGREGATE_SECURITY_EVENT_LISTENER = "aggregate-security-event-listener";
    String ALIAS = "alias";
    String ALIAS_ATTRIBUTE = "alias-attribute";
    String ALIAS_FILTER = "alias-filter";
    String ALGORITHM = "algorithm";
    String ALGORITHM_FROM = "algorithm-from";
    String ALLOW_ALL_MECHANISMS = "allow-all-mechanisms";
    String ALLOW_BLANK_PASSWORD = "allow-blank-password";
    String ALLOW_SASL_MECHANISMS = "allow-sasl-mechanisms";
    String AND = "and";
    String ANONYMOUS = "anonymous";
    String APPLICATION_BUFFER_SIZE = "application-buffer-size";
    String ARGUMENT = "argument";
    String ATTRIBUTE = "attribute";
    String ATTRIBUTE_MAPPING = "attribute-mapping";
    String ATTRIBUTE_NAME = "attribute-name";
    String ATTRIBUTE_VALUES = "attribute-values";
    String ATTRIBUTES = "attributes";
    String AUDIENCE = "audience";
    String AUDIT_LOGGING = "audit-logging";
    String AUTHENTICATION_CLIENT = "authentication-client";
    String AUTHENTICATION_CONFIGURATION = "authentication-configuration";
    String AUTHENTICATION_CONTEXT = "authentication-context";
    String AUTHENTICATION_LEVEL = "authentication-level";
    String AUTHENTICATION_NAME = "authentication-name";
    String AUTHENTICATION_OPTIONAL = "authentication-optional";
    String AUTHENTICATION_REALM = "authentication-realm";
    String AUTHORIZATION_NAME = "authorization-name";
    String AUTHORIZATION_REALM = "authorization-realm";
    String AVAILABLE_MECHANISMS = "available-mechanisms";

    String BCRYPT = "bcrypt";
    String BCRYPT_MAPPER = "bcrypt-mapper";

    String CACHING_REALM = "caching-realm";
    String CASE_SENSITIVE = "case-sensitive";
    String CERTIFICATE = "certificate";
    String CERTIFICATE_ATTRIBUTE = "certificate-attribute";
    String CERTIFICATE_CHAIN = "certificate-chain";
    String CERTIFICATE_CHAIN_ATTRIBUTE = "certificate-chain-attribute";
    String CERTIFICATE_CHAIN_ENCODING = "certificate-chain-encoding";
    String CERTIFICATE_FROM = "certificate-from";
    String CERTIFICATE_TYPE = "certificate-type";
    String CERTIFICATE_REVOCATION_LIST = "certificate-revocation-list";
    String CHAINED_PRINCIPAL_TRANSFORMER = "chained-principal-transformer";
    String CIPHER_SUITE = "cipher-suite";
    String CIPHER_SUITE_FILTER = "cipher-suite-filter";
    String CLASS_LOADING = "class-loading";
    String CLASS_NAME = "class-name";
    String CLASS_NAMES = "class-names";
    String CLEAR = "clear";
    String CLEAR_CACHE = "clear-cache";
    String CLEAR_PASSWORD_MAPPER = "clear-password-mapper";
    String CLIENT_ID = "client-id";
    String CLIENT_SECRET = "client-secret";
    String CLIENT_SSL_CONTEXT = "client-ssl-context";
    String CLIENT_SSL_CONTEXTS = "client-ssl-contexts";
    String CONCATENATING_PRINCIPAL_DECODER = "concatenating-principal-decoder";
    String CONFIGURABLE_HTTP_SERVER_MECHANISM_FACTORY = "configurable-http-server-mechanism-factory";
    String CONFIGURABLE_SASL_SERVER_FACTORY = "configurable-sasl-server-factory";
    String CONFIGURATION = "configuration";
    String CONFIGURATION_FACTORY = "configuration-factory";
    String CONFIGURATION_FILE = "configuration-file";
    String CONFIGURATION_PROPERTIES = "configuration-properties";
    String CONNECTION_TIMEOUT = "connection-timeout";
    String CONSTANT = "constant";
    String CONSTANT_PERMISSION_MAPPER = "constant-permission-mapper";
    String CONSTANT_PRINCIPAL_DECODER = "constant-principal-decoder";
    String CONSTANT_PRINCIPAL_TRANSFORMER = "constant-principal-transformer";
    String CONSTANT_REALM_MAPPER = "constant-realm-mapper";
    String CONSTANT_ROLE_MAPPER = "constant-role-mapper";
    String CREATION_DATE = "creation-date";
    String CREATION_TIME = "creation-time";
    String CREDENTIAL = "credential";
    String CREDENTIAL_SECURITY_FACTORIES = "credential-security-factories";
    String CREDENTIAL_SECURITY_FACTORY = "credential-security-factory";
    String CREDENTIAL_STORE = "credential-store";
    String CREDENTIAL_STORES = "credential-stores";
    String CREDENTIAL_STORE_NAME = "store.name";
    String CREDENTIAL_STORE_FILE = "store.file";
    String CREDENTIAL_STORE_BASE = "store.base";
    String CREDENTIALS = "credentials";
    String CUSTOM_CREDENTIAL_SECURITY_FACTORY = "custom-credential-security-factory";
    String CUSTOM_PERMISSION_MAPPER = "custom-permission-mapper";
    String CUSTOM_POLICY = "custom-policy";
    String CUSTOM_PRINCIPAL_DECODER = "custom-principal-decoder";
    String CUSTOM_PRINCIPAL_TRANSFORMER = "custom-principal-transformer";
    String CUSTOM_REALM = "custom-realm";
    String CUSTOM_MODIFIABLE_REALM = "custom-modifiable-realm";
    String CUSTOM_REALM_MAPPER = "custom-realm-mapper";
    String CUSTOM_ROLE_DECODER = "custom-role-decoder";
    String CUSTOM_ROLE_MAPPER = "custom-role-mapper";

    String DATA_SOURCE = "data-source";
    String DEBUG = "debug";
    String DEFAULT_AUTHENTICATION_CONTEXT = "default-authentication-context";
    String DEFAULT_POLICY = "default-policy";
    String DEFAULT_REALM = "default-realm";
    String DELEGATE_REALM_MAPPER = "delegate-realm-mapper";
    String DIGEST = "digest";
    String DIGEST_ALGORITHM = "digest-algorithm";
    String DIGEST_FROM = "digest-from";
    String DIGEST_REALM_NAME = "digest-realm-name";
    String DIR_CONTEXT = "dir-context";
    String DIR_CONTEXTS = "dir-contexts";
    String DIRECT_VERIFICATION = "direct-verification";

    String ELYTRON_SECURITY = "elytron-security";
    String ENABLE_CONNECTION_POOLING = "enable-connection-pooling";
    String ENABLING = "enabling";
    String ENCODED = "encoded";
    String ENTRY_TYPE = "entry-type";
    String EXTRACT_RDN = "extract-rdn";
    String EXTENDS = "extends";

    String FILE = "file";
    String FILE_AUDIT_LOG = "file-audit-log";
    String FILESYSTEM_REALM = "filesystem-realm";
    String FILTER = "filter";
    String FILTER_ALIAS = "filter-alias";
    String FILTER_BASE_DN = "filter-base-dn";
    String FILTER_CERTIFICATE = "filter-certificate";
    String FILTER_NAME = "filter-name";
    String FILTER_ITERATE = "filter-iterate";
    String FILTERING_KEY_STORE = "filtering-key-store";
    String FILTERS = "filters";
    String FINAL_PRINCIPAL_TRANSFORMER = "final-principal-transformer";
    String FINAL_PROVIDERS = "final-providers";
    String FINGER_PRINT = "finger-print";
    String FINGER_PRINTS = "finger-prints";
    String FIRST = "first";
    String FORBID_SASL_MECHANISMS = "forbid-sasl-mechanisms";
    String FORMAT = "format";
    String FROM = "from";

    String GREATER_THAN = "greater-than";
    String GROUPS = "groups";
    String GROUPS_ATTRIBUTE = "groups-attribute";
    String GROUPS_PROPERTIES = "groups-properties";

    String HOST = "host";
    String HOST_NAME = "host-name";
    String HOST_NAME_VERIFICATION_POLICY = "host-name-verification-policy";
    String HASH_FROM = "hash-from";
    String HTTP = "http";
    String HTTP_AUTHENTICATION_FACTORY = "http-authentication-factory";
    String HTTP_SERVER_MECHANISM_FACTORY = "http-server-mechanism-factory";
    String HTTP_SERVER_FACTORIES = "http-server-factories";

    String IDENTITY = "identity";
    String IDENTITY_MAPPING = "identity-mapping";
    String IDENTITY_REALM = "identity-realm";
    String IMPLEMENTATION = "implementation";
    String INDEX = "index";
    String INFO = "info";
    String INITIAL = "initial";
    String INITIAL_PROVIDERS = "initial-providers";
    String INTROSPECTION_URL = "introspection-url";
    String INVALIDATE = "invalidate";
    String ISSUER = "issuer";
    String ITERATION_COUNT = "iteration-count";
    String ITERATION_COUNT_INDEX = "iteration-count-index";
    String ITERATOR_FILTER = "iterator-filter";

    String JACC_POLICY = "jacc-policy";
    String JDBC_REALM = "jdbc-realm";
    String JOINER = "joiner";
    String JWT = "jwt";

    String KERBEROS_SECURITY_FACTORY = "kerberos-security-factory";
    String KEY = "key";
    String KEY_ATTRIBUTE = "key-attribute";
    String KEY_TYPE = "key-type";
    String KEY_MANAGER = "key-manager";
    String KEY_MANAGERS = "key-managers";
    String KEY_STORE = "key-store";
    String KEY_STORE_REALM = "key-store-realm";
    String KEY_STORES = "key-stores";

    String LAST_ACCESSED_TIME = "last-accessed-time";
    String LDAP_KEY_STORE = "ldap-key-store";
    String LDAP_MAPPING = "ldap-mapping";
    String LDAP_REALM = "ldap-realm";
    String LEFT = "left";
    String LESS_THAN = "less-than";
    String LEVELS = "levels";
    String LOAD = "load";
    String LOAD_SERVICES = "load-services";
    String LOADED_PROVIDER = "loaded-provider";
    String LOADED_PROVIDERS = "loaded-providers";
    String LOCAL_CERTIFICATES = "local-certificates";
    String LOCAL_PRINCIPAL = "local-principal";
    String LOGICAL_OPERATION = "logical-operation";
    String LOGICAL_PERMISSION_MAPPER = "logical-permission-mapper";
    String LOGICAL_ROLE_MAPPER = "logical-role-mapper";

    String MAPPED_REGEX_REALM_MAPPER = "mapped-regex-realm-mapper";
    String MAPPERS = "mappers";
    String MAPPING_MODE = "mapping-mode";
    String MATCH = "match";
    String MATCH_ABSTRACT_TYPE = "match-abstract-type";
    String MATCH_ABSTRACT_TYPE_AUTHORITY = "match-abstract-type-authority";
    String MATCH_HOST = "match-host";
    String MATCH_LOCAL_SECURITY_DOMAIN = "match-local-security-domain";
    String MATCH_NO_USER = "match-no-user";
    String MATCH_PATH = "match-path";
    String MATCH_PORT = "match-port";
    String MATCH_PROTOCOL = "match-protocol";
    String MATCH_PURPOSE = "match-purpose";
    String MATCH_RULE = "match-rule";
    String MATCH_RULES = "match-rules";
    String MATCH_URN = "match-urn";
    String MATCH_USER = "match-user";
    String MAXIMUM_AGE = "maximum-age";
    String MAXIMUM_CERT_PATH = "maximum-cert-path";
    String MAXIMUM_ENTRIES = "maximum-entries";
    String MAXIMUM_SEGMENTS = "maximum-segments";
    String MAXIMUM_SESSION_CACHE_SIZE = "maximum-session-cache-size";
    String MECHANISM = "mechanism";
    String MECHANISM_CONFIGURATION = "mechanism-configuration";
    String MECHANISM_CONFIGURATIONS = "mechanism-configurations";
    String MECHANISM_NAME = "mechanism-name";
    String MECHANISM_NAMES = "mechanism-names";
    String MECHANISM_OIDS = "mechanism-oids";
    String MECHANISM_PROPERTIES = "mechanism-properties";
    String MECHANISM_PROVIDER_FILTERING_SASL_SERVER_FACTORY = "mechanism-provider-filtering-sasl-server-factory";
    String MECHANISM_REALM = "mechanism-realm";
    String MECHANISM_REALM_CONFIGURATION = "mechanism-realm-configuration";
    String MECHANISM_REALM_CONFIGURATIONS = "mechanism-realm-configurations";
    String MINIMUM_REMAINING_LIFETIME = "minimum-remaining-lifetime";
    String MINUS = "minus";
    String MODIFIABLE_SECURITY_REALM = "modifiable-security-realm";
    String MODIFIED = "modified";
    String MODULE = "module";

    String NAME = "name";
    String NEED_CLIENT_AUTH = "need-client-auth";
    String NEW_IDENTITY_ATTRIBUTES = "new-identity-attributes";
    String NEW_IDENTITY_PARENT_DN = "new-identity-parent-dn";
    String NEW_ITEM_ATTRIBUTES = "new-item-attributes";
    String NEW_ITEM_TEMPLATE = "new-item-template";
    String NEW_ITEM_PATH = "new-item-path";
    String NEW_ITEM_RDN = "new-item-rdn";
    String NOT_AFTER = "not-after";
    String NOT_BEFORE = "not-before";

    String OAUTH2_INTROSPECTION = "oauth2-introspection";
    String OBTAIN_KERBEROS_TICKET = "obtain-kerberos-ticket";
    String OID = "oid";
    String OTHER_PROVIDERS = "other-providers";
    String OTP_CREDENTIAL_MAPPER = "otp-credential-mapper";
    String OPTION = "option";
    String OPTIONS = "options";
    String OR = "or";
    String OUTFLOW_ANONYMOUS = "outflow-anonymous";
    String OUTFLOW_SECURITY_DOMAINS = "outflow-security-domains";

    String PACKET_BUFFER_SIZE = "packet-buffer-size";
    String PATH = "path";
    String PASSWORD = "password";
    String PASSWORD_INDEX = "password-index";
    String PATTERN = "pattern";
    String PATTERN_FILTER = "pattern-filter";
    String PEER_CERTIFICATES = "peer-certificates";
    String PEER_HOST = "peer-host";
    String PEER_PORT = "peer-port";
    String PEER_PRINCIPAL = "peer-principal";
    String PERMISSION = "permission";
    String PERMISSIONS = "permissions";
    String PERMISSION_MAPPER = "permission-mapper";
    String PERMISSION_MAPPING = "permission-mapping";
    String PERMISSION_MAPPINGS = "permission-mappings";
    String PLAIN_TEXT = "plain-text";
    String POLICY = "policy";
    String PORT = "port";
    String POST_REALM_PRINCIPAL_TRANSFORMER = "post-realm-principal-transformer";
    String PRE_REALM_PRINCIPAL_TRANSFORMER = "pre-realm-principal-transformer";
    String PREDEFINED_FILTER = "predefined-filter";
    String PREFIX = "prefix";
    String PRINCIPAL = "principal";
    String PRINCIPALS = "principals";
    String PRINCIPAL_CLAIM = "principal-claim";
    String PRINCIPAL_DECODER = "principal-decoder";
    String PRINCIPAL_DECODERS = "principal-decoders";
    String PRINCIPAL_TRANSFORMER = "principal-transformer";
    String PRINCIPAL_TRANSFORMERS = "principal-transformers";
    String PRINCIPAL_QUERY = "principal-query";
    String PROPERTIES = "properties";
    String PROPERTIES_REALM = "properties-realm";
    String PROPERTY = "property";
    String PROPERTY_LIST = "property-list";
    String PROTOCOL = "protocol";
    String PROTOCOLS = "protocols";
    String PROVIDER = "provider";
    String PROVIDER_HTTP_SERVER_MECHANISM_FACTORY = "provider-http-server-mechanism-factory";
    String PROVIDER_LOADER = "provider-loader";
    String PROVIDER_NAME = "provider-name";
    String PROVIDER_REGISTRATION = "provider-registration";
    String PROVIDER_SASL_SERVER_FACTORY = "provider-sasl-server-factory";
    String PROVIDER_VERSION = "provider-version";
    String PROVIDERS = "providers";
    String PUBLIC_KEY = "public-key";

    String RDN_IDENTIFIER = "rdn-identifier";
    String READ_IDENTITY = "read-identity";
    String READ_TIMEOUT = "read-timeout";
    String REALM = "realm";
    String REALM_MAP = "realm-map";
    String REALM_MAPPER = "realm-mapper";
    String REALM_MAPPING = "realm-mapping";
    String REALM_NAME = "realm-name";
    String REALMS = "realms";
    String REFERENCE = "reference";
    String REFERRAL_MODE = "referral-mode";
    String REGEX_PRINCIPAL_TRANSFORMER = "regex-principal-transformer";
    String REGEX_VALIDATING_PRINCIPAL_TRANSFORMER = "regex-validating-principal-transformer";
    String REGISTER = "register";
    String RELATIVE_TO = "relative-to";
    String REMOVE_ATTRIBUTE = "remove-attribute";
    String REPLACE_ALL = "replace-all";
    String REPLACEMENT = "replacement";
    String REQUEST_LIFETIME = "request-lifetime";
    String REQUIRED = "required";
    String REQUIRED_OIDS = "required-oids";
    String REQUIRED_ATTRIBUTES = "required-attributes";
    String REVERSE = "reverse";
    String RIGHT = "right";
    String ROLE_DECODER = "role-decoder";
    String ROLE_RECURSION = "role-recursion";
    String ROLE_RECURSION_NAME = "role-recursion-name";
    String ROLE_MAPPER = "role-mapper";
    String ROLE_MAPPERS = "role-mappers";
    String ROLES = "roles";

    String SALT = "salt";
    String SALT_INDEX = "salt-index";
    String SALTED_SIMPLE_DIGEST = "salted-simple-digest";
    String SALTED_SIMPLE_DIGEST_MAPPER = "salted-simple-digest-mapper";
    String SASL = "sasl";
    String SASL_AUTHENTICATION_FACTORY = "sasl-authentication-factory";
    String SASL_SERVER_FACTORIES = "sasl-server-factories";
    String SASL_SERVER_FACTORY = "sasl-server-factory";
    String SCRAM_MAPPER = "scram-mapper";
    String SEARCH = "search";
    String SEARCH_BASE_DN = "search-base-dn";
    String SEARCH_PATH = "search-path";
    String SEARCH_RECURSIVE = "search-recursive";
    String SEARCH_TIME_LIMIT = "search-time-limit";
    String SECURITY_DOMAIN = "security-domain";
    String SECURITY_DOMAINS = "security-domains";
    String SECURITY_EVENT_LISTENER = "security-event-listener";
    String SECURITY_EVENT_LISTENERS = "security-event-listeners";
    String SECURITY_PROPERTIES = "security-properties";
    String SECURITY_PROPERTY = "security-property";
    String SECURITY_REALMS = "security-realms";
    String SECRET_VALUE = "secret-value";
    String SELECTION_CRITERIA = "selection-criteria";
    String SEED_FROM = "seed-from";
    String SERVER_NAME = "server-name";
    String SERIAL_NUMBER = "serial-number";
    String SERIAL_NUMBER_FROM = "serial-number-from";
    String SERVER = "server";
    String SERVER_ADDRESS = "server-address";
    String SERVER_SSL_CONTEXT = "server-ssl-context";
    String SERVER_SSL_CONTEXTS = "server-ssl-contexts";
    String SESSION_TIMEOUT = "session-timeout";
    String SET_PASSWORD = "set-password";
    String SERVICE = "service";
    String SERVICE_LOADER_HTTP_SERVER_MECHANISM_FACTORY = "service-loader-http-server-mechanism-factory";
    String SERVICE_LOADER_SASL_SERVER_FACTORY = "service-loader-sasl-server-factory";
    String SERVICES = "services";
    String SEQUENCE_FROM = "sequence-from";
    String SHA_1_DIGEST = "sha-1-digest";
    String SHA_256_DIGEST = "sha-256-digest";
    String SIGNATURE = "signature";
    String SIGNATURE_ALGORITHM = "signature-algorithm";
    String SIMPLE_DIGEST = "simple-digest";
    String SIMPLE_DIGEST_MAPPER = "simple-digest-mapper";
    String SIMPLE_PERMISSION_MAPPER = "simple-permission-mapper";
    String SIMPLE_REGEX_REALM_MAPPER = "simple-regex-realm-mapper";
    String SIMPLE_ROLE_DECODER = "simple-role-decoder";
    String SIZE = "size";
    String SQL = "sql";
    String SSL_CONTEXT = "ssl-context";
    String SSL_SESSION = "ssl-session";
    String START_SEGMENT = "start-segment";
    String STATE = "state";
    String STORE = "store";
    String SUBJECT = "subject";
    String SUBJECT_DN_FROM = "subject-dn-from";
    String SUFFIX = "suffix";
    String SYNCHRONIZED = "synchronized";
    String SYSLOG_AUDIT_LOG = "syslog-audit-log";

    String TARGET_NAME = "target-name";
    String TLS = "tls";
    String TO = "to";
    String TOKEN_REALM = "token-realm";
    String TRANSPORT = "transport";
    String TRUST_MANAGER = "trust-manager";
    String TRUST_MANAGERS = "trust-managers";
    String TRUSTED_SECURITY_DOMAINS = "trusted-security-domains";
    String TYPE = "type";

    String RELOAD = "reload";
    String RELOAD_CERTIFICATE_REVOCATION_LIST = "reload-certificate-revocation-list";
    String UNLESS = "unless";
    String URI = "uri";
    String URL = "url";
    String USE_RECURSIVE_SEARCH = "use-recursive-search";
    String USE_CIPHER_SUITES_ORDER = "use-cipher-suites-order";
    String USERS_PROPERTIES = "users-properties";
    String USER_PASSWORD_MAPPER = "user-password-mapper";

    String VALID = "valid";
    String VALUE = "value";
    String VERIFIABLE = "verifiable";
    String VERSION = "version";
    String VERSION_COMPARISON = "version-comparison";

    String WANT_CLIENT_AUTH = "want-client-auth";
    String WRAP = "wrap";
    String WRITABLE = "writable";

    String X500_ATTRIBUTE_PRINCIPAL_DECODER = "x500-attribute-principal-decoder";
    String X509_CREDENTIAL_MAPPER = "x509-credential-mapper";
    String XOR = "xor";

}