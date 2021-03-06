AWS Notes {#AWS Notes .justcenter}
=========

-   [Exam tips](#AWS Notes#Exam tips "wikilink")
    -   [Regions and
        AZs](#AWS Notes#Exam tips#Regions and AZs "wikilink")
-   [EC2](#AWS Notes#EC2 "wikilink")
-   [Auto-scaling Groups](#AWS Notes#Auto-scaling Groups "wikilink")
    -   [Pricing](#AWS Notes#Auto-scaling Groups#Pricing "wikilink")
    -   [Virtualization](#AWS Notes#Auto-scaling Groups#Virtualization "wikilink")
-   [Using the CLI](#AWS Notes#Using the CLI "wikilink")
-   [RDS](#AWS Notes#RDS "wikilink")
-   [Security Groups](#AWS Notes#Security Groups "wikilink")
-   [IAM Users, Groups and
    Roles](#AWS Notes#IAM Users, Groups and Roles "wikilink")
-   [Resource Groups and
    Tags](#AWS Notes#Resource Groups and Tags "wikilink")
-   [CloudWatch](#AWS Notes#CloudWatch "wikilink")
-   [DNS / Route53](#AWS Notes#DNS / Route53 "wikilink")
    -   [Record Sets](#AWS Notes#DNS / Route53#Record Sets "wikilink")
    -   [Elastic IP
        addresses](#AWS Notes#DNS / Route53#Elastic IP addresses "wikilink")
    -   [Health Checks /
        Routing](#AWS Notes#DNS / Route53#Health Checks / Routing "wikilink")
-   [S3 (Simple Storage
    Service)](#AWS Notes#S3 (Simple Storage Service) "wikilink")
    -   [S3 Consistency
        Model](#AWS Notes#S3 (Simple Storage Service)#S3 Consistency Model "wikilink")
    -   [Encryption for S3
        Objects](#AWS Notes#S3 (Simple Storage Service)#Encryption for S3 Objects "wikilink")
-   [Managing Growth and
    Costs](#AWS Notes#Managing Growth and Costs "wikilink")
-   [Resource Tags](#AWS Notes#Resource Tags "wikilink")
-   [Monitoring Resources with
    CloudWatch](#AWS Notes#Monitoring Resources with CloudWatch "wikilink")
-   [CLI Access](#AWS Notes#CLI Access "wikilink") [-](- "wikilink")
    [Organising AWS resources in
    VPCs](#AWS Notes#Organising AWS resources in VPCs "wikilink")
    -   [Route
        Tables](#AWS Notes#Organising AWS resources in VPCs#Route Tables "wikilink")
    -   [Access Control
        List](#AWS Notes#Organising AWS resources in VPCs#Access Control List "wikilink")
    -   [Availability
        Zones](#AWS Notes#Organising AWS resources in VPCs#Availability Zones "wikilink")
    -   [TCP / IP
        Addressing](#AWS Notes#Organising AWS resources in VPCs#TCP / IP Addressing "wikilink")
    -   [NAT
        Addressing](#AWS Notes#Organising AWS resources in VPCs#NAT Addressing "wikilink")
    -   [CIDR Blocks And
        Netmask](#AWS Notes#Organising AWS resources in VPCs#CIDR Blocks And Netmask "wikilink")
-   [Elastic Load
    Balancing](#AWS Notes#Elastic Load Balancing "wikilink")
-   [CloudFront (AWS\'
    CDN)](#AWS Notes#CloudFront (AWS' CDN) "wikilink")
-   [ElastiCache](#AWS Notes#ElastiCache "wikilink")
-   [Elastic Beanstalk](#AWS Notes#Elastic Beanstalk "wikilink")
-   [CloudFormation](#AWS Notes#CloudFormation "wikilink")
    -   [Resources](#AWS Notes#CloudFormation#Resources "wikilink")
    -   [Parameters](#AWS Notes#CloudFormation#Parameters "wikilink")
    -   [Mappings](#AWS Notes#CloudFormation#Mappings "wikilink")
    -   [Outputs](#AWS Notes#CloudFormation#Outputs "wikilink")
    -   [Conditions](#AWS Notes#CloudFormation#Conditions "wikilink")
    -   [Intrinsic
        Functions](#AWS Notes#CloudFormation#Intrinsic Functions "wikilink")
    -   [Rollbacks](#AWS Notes#CloudFormation#Rollbacks "wikilink")
-   [Monitoring & Audit](#AWS Notes#Monitoring & Audit "wikilink")
    -   [CloudWatch
        Logs](#AWS Notes#Monitoring & Audit#CloudWatch Logs "wikilink")
    -   [CloudWatch
        Events](#AWS Notes#Monitoring & Audit#CloudWatch Events "wikilink")
    -   [AWS X-Ray](#AWS Notes#Monitoring & Audit#AWS X-Ray "wikilink")
    -   [CloudTrail](#AWS Notes#Monitoring & Audit#CloudTrail "wikilink")
-   [Messaging &
    Integration](#AWS Notes#Messaging & Integration "wikilink")
    -   [SQS](#AWS Notes#Messaging & Integration#SQS "wikilink")
        -   [SQS
            Security](#AWS Notes#Messaging & Integration#SQS#SQS Security "wikilink")
    -   [SNS
        Topics](#AWS Notes#Messaging & Integration#SNS Topics "wikilink")
        -   [SNS & SQS: Fan-out messaging
            pattern](#AWS Notes#Messaging & Integration#SNS Topics#SNS & SQS: Fan-out messaging pattern "wikilink")
    -   [Kinesis](#AWS Notes#Messaging & Integration#Kinesis "wikilink")
        -   [KCL](#AWS Notes#Messaging & Integration#Kinesis#KCL "wikilink")
-   [Lambda](#AWS Notes#Lambda "wikilink")
    -   [Versions](#AWS Notes#Lambda#Versions "wikilink")
    -   [External
        Dependencies](#AWS Notes#Lambda#External Dependencies "wikilink")
    -   [Lamda and
        CloudFormation](#AWS Notes#Lambda#Lamda and CloudFormation "wikilink")
    -   [/tmp Space](#AWS Notes#Lambda#/tmp Space "wikilink")
        -   [Best
            Practices](#AWS Notes#Lambda#/tmp Space#Best Practices "wikilink")
    -   [Lambda @ Edge](#AWS Notes#Lambda#Lambda @ Edge "wikilink")
-   [DynamoDB](#AWS Notes#DynamoDB "wikilink")
    -   [Provisioned
        Throughput](#AWS Notes#DynamoDB#Provisioned Throughput "wikilink")
        -   [Write capacity
            Units](#AWS Notes#DynamoDB#Provisioned Throughput#Write capacity Units "wikilink")
        -   [Read capacity
            Units](#AWS Notes#DynamoDB#Provisioned Throughput#Read capacity Units "wikilink")
        -   [DynamoDB
            API](#AWS Notes#DynamoDB#Provisioned Throughput#DynamoDB API "wikilink")
    -   [Secondary
        Indexes](#AWS Notes#DynamoDB#Secondary Indexes "wikilink")
    -   [DAX](#AWS Notes#DynamoDB#DAX "wikilink")
    -   [DynamoDB
        Streams](#AWS Notes#DynamoDB#DynamoDB Streams "wikilink")
    -   [Dynamo
        Transactions](#AWS Notes#DynamoDB#Dynamo Transactions "wikilink")
    -   [Security](#AWS Notes#DynamoDB#Security "wikilink")
-   [API Gateway](#AWS Notes#API Gateway "wikilink")
    -   [Cognito](#AWS Notes#API Gateway#Cognito "wikilink")
-   [AWS SAM (Serverless Application
    Model)](#AWS Notes#AWS SAM (Serverless Application Model) "wikilink")
-   [AWS Step Functions](#AWS Notes#AWS Step Functions "wikilink")
-   [AWS SWF: Simple Workflow
    Service](#AWS Notes#AWS SWF: Simple Workflow Service "wikilink")
-   [ECS, ECR & Fargate: Docker in
    AWS](#AWS Notes#ECS, ECR & Fargate: Docker in AWS "wikilink")
-   [AWS Security & Encryption: KMS, SSM, IAM,
    SKS](#AWS Notes#AWS Security & Encryption: KMS, SSM, IAM, SKS "wikilink")
-   [ACM AWS Certificate
    Manager](#AWS Notes#ACM AWS Certificate Manager "wikilink")

Exam tips {#Exam tips}
---------

-   Memorize formulae for WCU and RCU from DynamoDB
-   AZs end in letters; Regions end in numbers

EC2 {#EC2}
---

-   Timeouts signify a security groups issue; could not connect is
    application error
-   Access via SSH managed with Key pairs (keep keyname.pem secure!)
    -   key file must have limited access (`chmod 400 keyname.pem`)
    -   `ssh -i keyname.pem <user>@<hostip>`
-   Use `User Data` to provide a bootstrap script
    -   Installing updates, downloading files from the internet, etc.
    -   Note this runs as the `root` OS user
-   Burstable instance (T2/T3 instance types)
    -   Exhausts burst credits while responding to spikes in load
-   EC2 Instance metadata allows instances to learn about themselves
    -   Prevents need for an IAM role to be granted for EC2 boxes to do
        this for themselves
    -   A URL endpoint that is available from within EC2 instances,. You
        can use this to retrieve IAM role name, user data, SGs,
        hostname, metrics etc.

Auto-scaling Groups {#Auto-scaling Groups}
-------------------

-   Use a launch configuration for declaring how to spin up a new
    instance
-   Can automatically register new instances to a load balancer
-   Can provide rules based on different metrics for when to change the
    number of instances in the ASG
-   Not just about scalability. Instances in an ASG get relaunched when
    they get terminated for whatever reason
-   Launch instances in different subnets to be highly-available
-   Scalaing policy will change Desired instances automatically

### Pricing {#Pricing}

-   On-demand pricing: pay for every hour instance is running
-   Reserve instances: longer-term committment and less than half price
    of on-demand
-   Spot-pricing: only runs instances when spot price is below a set
    threshold
    -   Applications must be able to handle plug being pulled!

### Virtualization {#Virtualization}

-   AMIs created for a region can only be seen in that region
-   Mainstream AMIs (Ubuntu, etc.) use a virtualization technology
    called []{#Hardware Virtual Machine (HVM)}**Hardware Virtual Machine
    (HVM)**
-   By default Amazon will select []{#Paravirtual (PV)}**Paravirtual
    (PV)** as the default in dropdowns, etc.
-   A mismatch here will make the image unbootable
-   So when creating images to use as backups, ensure that the correct
    value (typically HVM) is selected!

Using the CLI {#Using the CLI}
-------------

-   Example command: `aws s3 cp mybackup.tar.gz s3://<bucketname>`
-   Use `aws configure` to change settings in `~/.aws`
-   Account access keys, default region, output format, etc.
-   Use `--profile another-user` flag to run a command as a different
    IAM user
-   Never run `aws configure` on an EC2 box. Instead, better to give the
    EC2 box an IAM policy
-   Can use `--dry-run` to check commands are correct and permissions
    set up etc.
-   use sts to decode authorisation messages (need to authorise this in
    a policy)

RDS {#RDS}
---

-   Note that you need to configure security groups to allow ssh access
    to DB instances
    -   i.e. allow inbound traffic from ec2 security group in the RDS
        group
-   Also need to make publicly accessible if you want to connect
    directly from a remote machine
-   Can be multi-AZ (availability zone) replicated for increased
    reliability
    -   This used Synchronous replication
    -   This is to increase availability, for disaster recovery; not for
        scaling
        -   No manual intervention required
-   Connect to the instance (and prompt for password):
    -   `mysql -u wpuser -p --database=wordpressdb --host=wordpressdb.cv7megzdisns.eu-west-2.rds.amazonaws.com`
-   Replication is async, so eventually-consistent
-   Replicas can be promoted to their own database
-   Applications can use read-replicas (need to update connection
    strings); this is for scaling
-   Backups are automatically enabled daily
    -   7 days by default; can increase to 35;
-   Can manually create snapshots ad-hoc
-   Encryption can be enabled at rest with KMS; need to enforce SSL for
    encyption in flight
-   Aurora is AWS-optimised DB and can be used as if it\'s MYSQL or
    Postgres

Security Groups {#Security Groups}
---------------

-   Resources can be assigned to security groups.
-   These contain rules about inbound and outbound traffic (current IP,
    another SG, all IPs, etc.)
-   Good practice to maintain a separate SG for SSH access
-   All inbound traffic is blocked by default
-   All outbound traffic is authorized by default
-   SGs can reference other SGs. This is a powerful pattern for
    connecting services together

IAM Users, Groups and Roles {#IAM Users, Groups and Roles}
---------------------------

-   IAM controls access for individual users based on their
    authentication credentials
-   IAM provides finer-grained control than is possible with Security
    Groups.
-   An IAM user is effectively an account within an account (the root)
-   IAM Policies define \"who can perform which action on what
    resource\"
-   Policies can be given to IAM roles and groups as well as users (e.g.
    Support Team)
-   Permissions and rights can also be assigned to AWS objects (like EC2
    instances) through IAM *Roles*.
    -   NB Roles are especially useful for programmatic access to AWS
        resources
-   It is good practice to create an IAM user associated with the
    `AdministratorAccess` policy and use that rather than the root
    account for admin
-   A link is generated for IAM users to access the console for a
    particular account
-   AWS provides policy generator and simulator tools

Resource Groups and Tags {#Resource Groups and Tags}
------------------------

-   Use tags (key-value pairs) to help identify and keep track of
    resources
-   Resource Groups use tags to group sets of associated resources
    within an account.
-   Particularly useful for tracking different project budgets

CloudWatch {#CloudWatch}
----------

-   Provides detailed metrics and charts for AWS resources
-   NB AWS Budgets is a newer, simpler way of managing costs but with
    fewer features
    -   Includes Cost Explorer tool

DNS / Route53 {#DNS / Route53}
-------------

### Record Sets {#Record Sets}

-   A set of data records that defines a particular aspect of domain
    behaviour

```{=html}
<!-- -->
```
-   Name servers provide mapping from a domain name to an IP address
-   A \'Hosted Zone\' is a set of configuration for a particular domain
-   \'A Name\' records are the mapping from domain name to IP address
-   \'C Name\' records (canonical name) redirect multiple domains to one
    -   e.g. www.google.com -\> google.com
-   \'AAAA\' records are for IPv6 addresses
-   Alias is from url to AWS resource (this is faster than using CNAME
    for this)
-   So use Alias for mapping URL to ALB

### Elastic IP addresses {#Elastic IP addresses}

-   NB IP addresses for EC2 instances will change on restart!
-   Elastic IP Provides a single, static IP address to solve this
    problem
-   Elastic IP addresses can be associated with any existing instance or
    network interface in your account
-   In general, try and avoid using these; they\'re an architecutre
    smell
    -   Limited to 5 per account
    -   Can use a random ip and assign a DNS name to it, or set up a
        load balancer instead

### Health Checks / Routing {#Health Checks / Routing}

-   SNS / email alerts can be set up to ping an IP address or domain
-   Routing policies provide fine-grained control over where traffic
    gets sent
    -   some overlap here w/ ELB

S3 (Simple Storage Service) {#S3 (Simple Storage Service)}
---------------------------

-   Bucket names must be globally unique
    -   No uppercase, no underscore, 3-53 chars long; not an ip; must
        start letter or digit
-   Use tags to organise resources
-   S3 is global service, but you do specify a region for individual
    buckets
-   Objects have a key. Key is full path (directories are virtual; in
    fact key paths)
-   Can set up versioning and access request logging for files in
    buckets
-   Tiered pricing: Standard; Standard IA (Infrequent Access); Reduced
    Redundancy (best avoided)
-   Files stored in S3 can be encrypted
-   Versioning is enabled at the bucket level
-   Any file not versioned before it\'s enabled will get \'null\'
    version id
-   Deleting a versioned file adds a delete marker to the file
-   Bucket Properties tab contains an option for
    []{#static website hosting}**static website hosting**
    -   Upload a (publicly-accessibly) index.html to the bucket
    -   URL given in the properties tab; can use Route53 for domain name
        config
-   Can perform operations using the CLI:
    -   `aws s3 cp mybackup.tar.gz s3://<bucketname>`
        -   `aws s3 ls s3://<bucketname>`
    -   etc. See `aws s3 help` for more
-   Use multi-part upload for objects \> 100mb
    -   mandatory for objects \> 5GB

### S3 Consistency Model {#S3 Consistency Model}

-   Read after PUT for new objects is write-consistent
-   But GET requests are cached, so GET,PUT,GET might return 404 at
    first
-   DELETE and PUT for existing objects are eventually-consistent

### Encryption for S3 Objects {#Encryption for S3 Objects}

-   Can enforce this with bucket policies (this is good practice if you
    want encryption)
-   4 Methods (SSE=server-side encryption)
    -   SSE-S3 - AWS managed keys (uses AES-256 )
        -   must add a header
            (\``"x-amz-server-side-encryption": "aes256"`\`)
    -   SSE-KMS - kms managed keys
        -   provides more control and an audit trail
        -   must add a header
            (\``"x-amz-server-side-encryption": "aws:kms"`\`)
    -   SSE-C - user provided keys
        -   HTTPS must be used
        -   Key must be provided in the HTTP headers for every request
        -   S3 does not store key
    -   Client-side encryption
        -   only send objects once encrypted
        -   decryption happens after retrieval

```{=html}
<!-- -->
```
-   Encryption in transit (SSL)
    -   S3 exposes HTTP and HTTPS endpoints (latter supports encryption
        in transit)

Managing Growth and Costs {#Managing Growth and Costs}
-------------------------

-   Tool for estimating the costs of an AWS cloud project:
    -   Simple Monthly Calculator can compute precise estimates for
        given scenarios
    -   Total Cost of Ownership Calculator can estimate potential
        savings of migrating to AWS from on-prem solution
-   NB Charges for different services vary across Geographic regions

Resource Tags {#Resource Tags}
-------------

-   Key-value pairs that can be associated with pieces of AWS
    infrastructure
-   Don\'t start names with `aws:` prefix; it\'s reserved for internal
    use
-   []{#Resource Groups}**Resource Groups** use tags to associate
    resources within an account
    -   Can be used to display a customised AWS Console showing only
        tagged resources
-   AWS Tag Editor tool helps manage tags

Monitoring Resources with CloudWatch {#Monitoring Resources with CloudWatch}
------------------------------------

-   CloudWatch is the engine that drives AWS Budgets
-   Budgets provide fine-grained control over account spend
-   Only the root user can change budgets; this is to limit damage if an
    IAM Admin gets hacked
-   Set up alerts when thresholds are hit
    -   SNS topics can rout to email, SMS, mobile devices, etc.
-   NB CloudWatch alerts are region-specific
-   CloudWatch provides a greater array of alerts than the (newer)
    Budgets tool
-   `VolumeIdleTime` on EBS instances is a useful metric in CloudWatch
    for checking if you\'re over-allocating resources

CLI Access {#CLI Access}
----------

-   Credentials and config stored in `~/.aws`
-   `aws configure` can be used to set/modify access keys and
    preferences
-   Example command:
    `aws ec2 describe-instance --output=table|json|text --profile test-account`
-   `aws help` or, e.g. `aws ec2 help`,
    `aws iam help add-user-to-group`, etc. are very useful resources!
-   Using the above, commands and resources are *discoverable* through
    the AWS CLI.

Organising AWS resources in VPCs {#Organising AWS resources in VPCs}
--------------------------------

-   A VPC helps keep related resources isolated from other resources in
    an account
-   When you launch resources (e.g. EC2 instances), they inherit the
    VPC\'s security and connectivity settings
-   For example, could keep production resources in one VPC, marketing
    resources in another; and dev and test in a third..
-   NB AWS Console provides a wizard for setting up common scenarios
    -   Use this to avoid common security holes and guesswork
-   Use Subnets within a VPC to isolate resources: e.g. web server in
    public subnet; DB in private

### Route Tables {#Route Tables}

-   Contains information that devices in a VPC need to communicate with
    resources inside and outside of the VPC
-   May contain a link to an Internet Gateway to allow traffic from
    connected objects to reach the internet.

### Access Control List {#Access Control List}

-   Contains rules that control what kind of traffic is allowed both
    into and out of the VPC
-   Note this evaluates each rule in order in the table, so we can
    provide a default rule at the end (e.g. to deny anything not defined
    above)
-   Used for fine-grained control; use security groups for the heavy
    lifting here

### Availability Zones {#Availability Zones}

-   Subnets cannot straddle multiple AZs
-   Used for increasing resiliance: spin up same server in subnets in
    different AZs

### TCP / IP Addressing {#TCP / IP Addressing}

-   Every connected device must be assigned at least 1 IP address
-   IP addresses must be unique across the network
-   IPv4 protocol: each address has four 8-bit octets (a number between
    0 and 255)
    -   e.g. `54.239.30.25`
    -   So there are (256\^4) possible IP addresses
-   To avoid running out, there are two soliutions: IPv6 (simply a
    larger pool) and NAT

### NAT Addressing {#NAT Addressing}

-   NAT provides a mapping from a public IP address to many private
    addresses used in a local network
    -   Private addresses only have to be unique within the local
        network
-   Private addresses are usually organised into smaller network (or
    subnet) blocks
    -   The host network is identified by the octets to the left of the
        address
    -   The device is identified by the octets to the right
    -   For example, if the first three octets define the subnet, then:
        -   We could have two subnets: `192.168.1` and `192.168.2`
        -   Devices on `192.168.1.4` and `192.168.2.4` would be on
            different networks, and might not have access to each other

### CIDR Blocks And Netmask {#CIDR Blocks And Netmask}

-   Standard notation for a network to declare which octets define the
    network
-   []{#Classless Inter-Domain Routing}**Classless Inter-Domain
    Routing**
-   Note that netmask is an alternative notation to CIDR
-   In the previous example, the first network would be represented as
    `192.168.1.0/24`
    -   The `/24` means that the first three octets (`8*3=24`) make up
        the network portion
    -   Using netmask, this would be `255.255.255.0` showing all 8 bits
        of the first three octets are used for the network portion, and
        none of the fourth
    -   Not necessary to use all 8 bits in an octet. For example could
        split the third octet between networks and devices
        -   Could represent this as `192.168.0.0/20` or with netmask
            `255.255.240.0`
-   Use binary counting or online subnet calculators to work out the
    notation for a particular setup.

Elastic Load Balancing {#Elastic Load Balancing}
----------------------

-   Highly configurable for routing traffic to different servers
-   For scalability, availability, serving requests from a
    geographically-closer server etc.
-   The load balancer itself consists of settings rather than
    infrastructure, so should survive any disruption to physical data
    centers, etc.
-   Everything the ELB points to is associated in a
    []{#Target Group}**Target Group**
-   Configure health check for the target group so that ELB knows where
    it can route traffic
-   Typically, we\'ll want to use Application or Network Load Balancers,
    rather than Classic (legacy)
-   ALB allows routing traffic for multiple applications or instances on
    same machine
    -   (multiple target groups per ALB)
    -   Supports sticky sessions
    -   Applications don\'t see client IP directly
        -   To get this, use `X-Forwarded-For` header
-   Also associate ELB with AZs; it will route traffic only to targets
    in these zones
-   Network load balancers are extremely low latency; work at TCP rather
    than HTTP layer
    -   Not the default choice; you usually want an ALB
    -   ALB for HTTP/HTTPS/WebSocket; NLB for TCP
-   Do not resolve the url to use the underlying IP \-- it\'s a load
    balancer!
-   Can associate a SG with ALB, so that traffic to nodes can only come
    from ALB

== CloudFront (AWS\' CDN)==

-   Allows content to be served from edge locations (\~136 Points of
    Presence locally)
-   We can add a certificate for TLS using AWS Certificate Manager (ACM)
-   Can log traffic to S3
-   Can help protect against DDOS attacks
-   Supports RTMP Protocol (videos / media)

ElastiCache {#ElastiCache}
-----------

-   Provides managed Memcached or Redis
    -   Redis survives reboots; is a key-value store
    -   Memache loses data on reboot; is an object store
    -   Redis is now more popular; serves most use-cases better
-   Similar to RDS, but for caches
-   Helps make your application stateless; write scaling using sharding
    -   Session state, distributed state, leaderboards, etc.
-   Caching stratgies
    -   Lazy loading (cache misses go to DB, then write to cache)
        -   Data may be stale; only store entries that are actually
            requested
        -   Will incur a read-penalty (for cache misses)
    -   Write-through
        -   Data will never be stale
        -   Will have a write penalty
    -   Typically will combine these approaches

Elastic Beanstalk {#Elastic Beanstalk}
-----------------

-   Uses CloudFormation under the hood
-   Provides a developer-centric view of deploying apps on AWS
-   Puts resources (ECS, ElastiCache, RDS) all in one place
-   3 architecture models:
    -   Single Instance
    -   LB + ASG
    -   ASG only (good for non-webapps, workers, etc.)
-   3 components: application, version, env name
-   Can promote app versions through environments (and supports
    rollback)
-   Deployment Modes:
    -   All at once
        -   Stop everything, deploy, then restart
            -   Very fast deployment
            -   Incurs downtime; no additional cost
    -   Rolling
        -   Few instances (bucket of configurable size) at a time, then
            move onto next bucket once first is healthy
        -   No downtime, no additional cost, some reduced capacity
        -   Slower deployment
    -   Rolling with additional batches,
        -   Spin up new instances to move the batch
        -   Small additional cost
        -   Always at full capacity (sometimes over capacity)
        -   Add then remove
    -   Immutable
        -   New instances in new ASG, then switch load when all instance
            healthy
        -   V quick rollback
        -   High cost (double capacity)
        -   No downtime, longest deployment
-   Can do config-as-code with yaml/json in .ebextensions dir of source
    root
    -   files have .config extensions, e.g. logging.config
-   Can use dedicated EB CLI tool for managing Beanstalk apps
    -   Good for orchestrating deployment pipelines
-   Can speed up deployements by deploying dependencies in source zip
-   Use lifecycle policy (time or space based) to remove old versions
    (1000 limit)
-   Can schedule tasks with cron.yaml

CloudFormation {#CloudFormation}
--------------

-   Yaml files provide infrastructure as code (can also use JSON)
-   Emits events as templates get uploaded
-   Immutability; upload new template and AWS will do the diff; can\'t
    mutate existing resources
-   Templates can take parameters (e.g. security group descriptions)
-   Preview your changes will show the diff (Add/Modify etc.) against
    resources

### Resources {#Resources}

-   Only mandatory section of a CF template!
-   All the things you can create with CloudFormation
-   Docs specify whether resource will be replaced on deploying a
    template
-   Not possible to perform code generation
-   Use Lambda Custom resources for resources that are not natively
    supported in CF

### Parameters {#Parameters}

-   Allow you to pass in params to templates that are not known ahead of
    time
-   Supports reuse of templates etc.
-   Reference a parameter with `!Ref <param-name>`
-   Use AllowedValues or AllowedPattern for validation
-   Declare parameters in a `Parameters` section of yaml file
-   AWS provides pseudo-parameters that can be used in any CF template
    -   These provide access to:
        -   AccountId, Region, StackName, StackId, etc.

### Mappings {#Mappings}

-   Fixed variables in CF templates
-   Useful to differentiate between environments, regions, AMI types,
    etc.
-   (Nested) key-value pairs where key is the differentiator
-   Use `Fn::FindInMap` (or
    `!FindInMap [MapName, TopLevelKey, SecondLevelKey]`) to pick a value
    from a mapping

### Outputs {#Outputs}

-   Declare outputs form a template that can be imported into other
    stacks (provided they are exported)
-   Useful so you can define a network in one stack and then reference
    Subnets, VPC id etc. in another stack
-   Can\'t delete a Stack if its outputs are being referenced by another
    CloudFormation stack
-   Use `Export:` block within `Outputs` block

### Conditions {#Conditions}

-   Control creation of resources based on a condition
-   Declare conditions in `Condition` block using boolean operators
-   Use a condition with `Condition: <condition-name>`

### Intrinsic Functions {#Intrinsic Functions}

-   `Fn::Ref`
    -   reference parameters or resources (returns physical id))
-   `Fn::GetAtt`
    -   e.g. `!GetAtt EC2Instance.AvailabilityZone`
-   `Fn::FindInMap`
-   `Fn::ImportValue`
    -   Allows us to use values that have been exported in other
        templates
-   `Fn::Join`
    -   Join values with a delimeter, e.g. `!Join [":", [a,b,c]]` yields
        `a:b:c`
-   `Fn::Sub`
    -   Substitute allows you to do string interpolation with
        `${VariableName}`\`

### Rollbacks {#Rollbacks}

-   If stack creation fails, everything gets rolled back
-   If update fails, rolls back to last known working state
-   Opti[o](o "wikilink")n to disable rollback and troubleshoot what
    happened

Monitoring & Audit {#Monitoring & Audit}
------------------

-   AWS CloudWatch allows you to collect metrics and logs
    -   Set up dashboards and alarms
-   X-Ray provides distributed tracing of microservices
-   CloudTrail allows internal monitoring of AWS resources via API calls
    being made
-   Metrics belong to namespaces
-   20 dimensions per per metric (e.g. instanceId, environment etc.)
-   By default get metrics every 5 mins
-   Detailed monitoring is more expensive but gives metrics every 1
    minute
-   Can define custom metrics to send to CloudWatch
    -   Supports higher resolution custom metrics (e.g. every second)
-   Use API called `PutMetricData` with exponentialBackoff
-   Alarms are based on thresholds for a particular metric
-   Can send notifications from alarms to SNS, EC2, ASG, etc.

### CloudWatch Logs {#CloudWatch Logs}

-   CloudWatch can collect logs from many AWS resources
-   Can export logs to S3 or stream to ElasticSearch / Lambda for
    further analysis
-   Can define log expiration policies
    -   Never expire by default!
-   Need correct IAM permissions to view logs in CloudWatch
-   Encrypt logs with KMS at log group level

### CloudWatch Events {#CloudWatch Events}

-   Schedule: Cron jobs
-   Event Pattern: react to a service doing something and trigger
    another action
    -   e.g. a lambda, SQS, etc.

### AWS X-Ray {#AWS X-Ray}

-   Supports distributed tracing and central service map visualisation
    across resources
-   Understand microservice dependencies
-   Can verify SLAs are met, find errors, etc.
-   Enable it in the code using X-Ray sdk. App will then capture the
    traces
-   Or install X-Ray daemon on machines; lambda already has this
    running!
-   All apps must have IAM rights (across accounts!) to write data to
    X-Ray
-   []{#Segments}**Segments**: each app/service will send them
-   []{#Trace}**Trace**: segments join together to form an end-to-end
    trace
-   []{#Sampling}**Sampling**: Decrease the amount of requests sent to
    x-ray; reduce cost
-   []{#Annotations}**Annotations**: Key-value pairs used to index
    traces and enable filters
-   []{#Metadata}**Metadata**: Key-value pairs not indexed; not used for
    searching

### CloudTrail {#CloudTrail}

-   Provides an audit log of access to AWS resources by logging API
    calls

Messaging & Integration {#Messaging & Integration}
-----------------------

### SQS {#SQS}

-   Default retention period is 4 days (configurable up to 14)
-   Can have duplicate msgs (at least once delivery)
-   Can receive msgs out of order (best effort ordering)
-   Limit of 256KB per msg
-   Delay queue allows messages to be hidden from consumers for up to 15
    minutes
    -   Default is 0 seconds
    -   `DelaySeconds` parameter
-   Message attributes: Name, Type, Value
-   On publish get back message identifier and MD5 hash of body
-   Consumers poll SQS for messages (can receive up to 10 at once)
-   Consumers have duty to process messages within visibility timeout
-   Once they are done, they can delete the message using message ID and
    receipt handle
-   Messages are invisible to other consumers during visibility timeout
    when consumer polls them
    -   Default timeout is 30 seconds
-   If consumer exceeds timeout, message will become visible to other
    consumers, so might get processed twice!
-   Can use `ChangeMessageVisibility` API to change visibility when
    processing a message
-   Use `DeleteMessage` API to tell SQS a message was successfully
    processed
    -   This is like an ACK
-   If a consumer fails to process message it goes back to queue n times
    before it then gets sent to a DLQ (this is set up via a redrive
    policy)
    -   We must explicitly create and DLQ and designate it as such
-   Need to make sure we process the messages in DLQ before they expire!
-   Long Polling
    -   If there are no messages, consumers can be configured to wait
        until there are some
    -   Reduces number of API calls to SQS when polling (can configure
        between 1 and 20 seconds)
-   Standard Queue supports v high throughput; FIFO queue 300 API ops
    per second, but guarantees FIFO delivery and exactly-once processing
    -   FIFO queue names must end in `.fifo`
    -   Need to provide a `MessageDeduplicationId` with your message (or
        can configure to use hash of payload)
    -   Will ignore duplicate values during 5 minute interval
    -   Specify a `MessageGroupId` to preserve ordering within a
        MessageGroupId
    -   Messages with same Group ID are delivered to one consumer at a
        time
-   SQS Extended Client is a Java library for larger than 256KB msgs
    -   Leverages S3 on top of SQS queue
-   Batch SendMessage, DeleteMessage, ChangeMessageVisibility APIs for
    lower cost usage

#### SQS Security {#SQS Security}

-   Encryption in flight using HTTPS
-   Can enable SSE using KMS
    -   Only encrypts body, so don\'t store sensitive data in attributes
-   No VPC access (requires access over internet)

### SNS Topics {#SNS Topics}

-   Used for sending messages to many receivers via SNS Topics
-   Up to 10 million subscriptions per topic
-   Each subscriber can filter for events on a topic
-   100k topic limit per account
-   Native integration with many AWS services
    -   (S3, CloudWatch, Lambda, SQS, HTTPS, Email, SNS, Mobile push
        etc.)
-   Topic publish using SDK or direct publish for mobile apps SDK

#### SNS & SQS: Fan-out messaging pattern {#SNS & SQS: Fan-out messaging pattern}

-   Bind many SQS queue to one SNS topic
-   Fully decoupled
-   No data loss
-   Can add more receivers later

### Kinesis {#Kinesis}

-   Managed alternative to Apache Kafka
-   Big Data, real-time streaming tool
-   Great for streaming processing frameworks (Spark, etc.)
-   Automatically replicated to 3 AZs
-   3 products
    -   Kinesis Streams - low-latency streaming ingest at scale
    -   Kinesis Analytics - use SQL to perform real-time analytics on
        streams
    -   Kinesis Firehose - load streams into other services (S3,
        Redshift, etc.)
-   Streams are divided into ordered shards/partitions
    -   Shards are like lanes in a highway; add these to increase
        throughput
    -   A shard represents 1mbps at write per shard; 2mbps read per
        shard
-   Data retention up to 7 days; 1 by default
-   Ability to reprocess / replay data
    -   This is big difference to SQS messaging
-   Multiple apps can consume from same stream
-   Records are ordered per shard
    -   Can add or reshard/merge shards to scale up/down throughput
-   Provide a message key that\'s used to determine which shard message
    goes to
    -   So choose a key that is highly distributed (user id is good;
        country is not)
-   Get ProvisionedThroughputExceeded Excpetion is sending more data
    than our number of shards can handle
    -   Need to choose a better partition key; increase shards or retry
        with backoff
-   Can use CLI/SDKs or Kinesis Client Library (KCL), which uses
    DynamoDB under the hood to track workers and share work amongst
    shards and checkpoint stream offsets
-   Use `get-shard-iterator` to get records from a stream. Can start
    iterator from latest of trim horizon (earliest record in shard)
-   Note that message data is Base64 encoded
-   Can create new streams from real-time queries in Kinesis Analytics

#### KCL {#KCL}

-   Helps read records from Kinesis with distributed applications
    sharing the read workload
-   Rule: each shard is to be read by only one KCL instance
    -   So reshard and then add more KCL instances to scale up
-   Progress is checkpointed by KCL into DynamoDB (required IAM)

Lambda {#Lambda}
------

-   Pay per request and compute time (in 100ms increments)
-   Resources can be given up to 3GB of RAM; 512MB of space in `/tmp`
-   Zip file must be max 50MB
-   Uncompressed must be max 250MB
    -   Increasing RAM will also scale up CPU and network
-   Integrated with whole AWS stack
    -   Lambdas can be triggered by S3 / SQS / CloudWatch Logs / Kinesis
        / API Gateway/ DynamoDB etc.
-   Lambda can be used for serverless cron jobs (triggered by CloudWatch
    events)
-   Attach IAM roles to lambda functions to enable the lambda to
    interact with other resources
    -   Need IAM permissions to log to CloudWatch logs / X-Ray traces
-   Timeouts: default 3 seconds; limit is configurable to 15 minutes
-   Can set environment variables to allow lambdas to be reused in
    different envs / contexts
-   Can set lambda to run within a VPC with security groups, subnets,
    etc.
-   Visual designer is available in AWS console to view triggers and
    outputs
-   Concurrency: up to 1000 executions per account (more requires AWS
    ticket)
    -   Can set a reserved concurrency at the function level
    -   Async invocations retry twice then go to DLQ if over throttle
        limit; sync invocations will fail
        -   DLQ can be SNS or SQS queue (nb need correct IAM permissions
            for these services)
-   Add X-Ray traces with `Enable active tracing` setting

### Versions {#Versions}

-   \$LATEST is mutable; V1,V2 are immutable
-   Each version gets its own ARN
-   Create versions by snapshotting \$LATEST (\'Publish new version\')
-   Aliases are mutable pointers to lambda versions
-   Can create dev, test and prod aliases and point them to specific
    versions
-   Users interact with the aliases (exposed as ARNs)
-   This allows us to configure versions for environments by pointing
    alias to a version
-   Can weight % of invocations to different versions of lambda using
    the alias as a router

### External Dependencies {#External Dependencies}

-   If your lambda function depends on external libraries or SDKs, you
    need to install the packages alongside your code and zip it together
    -   Native libraries have to be compiled on Amazon Linux
-   AWS SDK comes bundled in every lambda function (don\'t need to
    explicitly install)

### Lamda and CloudFormation {#Lamda and CloudFormation}

-   Lambda zip in S3
-   Refer S3 location in CloudFormation template

### /tmp Space {#/tmp Space}

-   Use S3 for permanent persistence; `/tmp` is for storage while the
    lambda is running

#### Best Practices {#Best Practices}

-   Perform heavy duty work outside of function handler (in execution
    context!)
    -   e.g. connect to DB, pull in dependencies or datasets
    -   Extract to outside handler function in lambda code to move to
        execution context
    -   Only handle function gets called on each subsequent invocation
-   Use env vars for db connection strings; sensitive values (and
    encrypt with KMS)
-   Minimise deployment package size
-   Avoid recursive lambda calls!
-   Don\'t put lambdas in VPC unless you have to (will take longer to
    initialise)

### Lambda @ Edge {#Lambda @ Edge}

-   Allows you to run lambdas on CloudFront edge locations
-   Enables more globally responsive applications
-   Can use lambdas to configure CloudFront requests and responses to
    Origin
    -   SEO, Website security and privacy, tracking, A/B testing, etc.

DynamoDB {#DynamoDB}
--------

-   A NoSQL serverless database
    -   NoSQL dbs are non-relational and are distributed
    -   Do joins client-side or keep all data for each query in one
        table
    -   This means that they scala horizontally (RDBMS only scales
        vertically)
-   Uses optimistic locking
-   Fully managed, highly-available with replication across 3 AZs
-   Massively scalable, integrated with IAM
-   Enables event-driven programming with DynamoDB streams
-   Each table has a primary key; and can store an infinite number of
    items
-   Each item can have attributes - can be added over time
    -   These are the `values` in the key-value map that dynamo
        represents
-   Max item size is 400KB
-   Supported data types:
    -   String, Number, Binary, Boolean, Null
    -   Also: Document Types: (List, Map)
    -   Also: Set Types: String Set, Number Set, Binary Set
-   Primary keys
    -   Partition key only (hash)
        -   e.g. user id for a users table
        -   Must be diverse so that the data is distributed
        -   Must be unique for each item
        -   Choose key with high cardinality with decent distribution
    -   Partition key + sort key
        -   e.g. user\_id for partition key; game id for sort key
        -   Combination must be unique
        -   Data is grouped physically by partition key
        -   Sort key is the range key
            -   Allows for very efficient queries
-   Only partition and sort key are mandatory; all other attributes can
    be null
-   TTL can be set up (deletes will not use WCU/RCU)
    -   You define a column to use for TTL expiry and add a date there
    -   Will delete row within 48 hours of expiration
    -   Streams could be used for recovering deleted events
-   `--projection-expression` - a list of attributes to retrieve
-   `--filter-expression` - filter results
-   `--page-size` - smaller page size =\> less chance of timeouts
    -   Will still retrieve all items; jsut makes more API calls to get
        them
-   `--max-items` to limit the number of items returned (to implement
    pagination)
-   `--starting-token` to show where to get next page from
-   Can install DynamoDB locally on your computer

### Provisioned Throughput {#Provisioned Throughput}

-   WCU / RCU = write/read capacity units must be provisioned up front
-   Option to set up autoscaling with options to use burst credits
-   If you exceed credits, you\'ll get a `ProvisionedThrougputException`
    -   It is advised to used exponential backoff retry

#### Write capacity Units {#Write capacity Units}

-   One WCU represents one write per second for an item up to 1KB in
    size
-   Items \>1KB conusme more WCU (round up to upper KB)
-   WCUs are spread evenly across partitions (hence need for
    distributing items by partition keys)

#### Read capacity Units {#Read capacity Units}

-   Can choose between strongly consistent read vs. eventually
    consistent read
-   By default, DynamoDB uses eventually consistent reads
    -   `GetItem`, `Query` and `Scan` operations provide a
        `ConsistentRead` parameter you can set to true
-   One RCU represents:
    -   One strongly consistent read per second OR
    -   Two eventually consistent reads
    -   For an item up to 4KB in size (rounds up to 4KB increments)

#### DynamoDB API {#DynamoDB API}

-   `PutItem`: Write data to DynamoDB (create data or full replace)
    -   Consumes WCU
-   `UpdateItem`: Partial update of attributes
    -   Can use Atomic Counters and increment them
-   `DeleteItem`: Delete individual row
    -   Supports conditional Delete
-   `DeleteTable`: Delete entire table
    -   Much more efficient than batch writes
-   `BatchWriteItem`
    -   Up to 25 PutItem or DeleteItem requests in one API call
    -   Helps reduce latency
    -   Operations are done in parallel
    -   If part of a batch fails, have to retry failed items
-   `Query`
    -   Requires: partitionKey (=), SortKey value (=,\< \<=, \>, \>=,
        Between, Begin) -- optional
    -   FilterExpression for client-side filtering of results
    -   Returns up to 1MB of data or number of items specified in
        `Limit`
    -   Can query table, local secondary index or a global secondary
        index
-   `Scan`
    -   Scan entire table then filter out data
    -   Inefficient and expensive in terms of RCU
    -   For faster performance, use parallel scans
    -   Can use Limit to reduce number of rows returned

### Secondary Indexes {#Secondary Indexes}

-   Allows you to query by more attributes for greater efficiency
-   Can query on table or index
-   Global Secondary Index
    -   A whole new table; required WCU and RCUs
    -   If writes are throttled in GSU, then main table will be
        throttled
    -   Can choose whole new partition key and sort key
-   Local Secondary Index
    -   Uses WCU and RCU of main table
    -   No special throttling considerations
    -   Must use same partition key of main table

### DAX {#DAX}

-   DynamoDB Accelerator provides microsecond latency
-   Seamless Cache for DynamoDB (with 5 minute TTL)
-   Solves the hot key problem

### DynamoDB Streams {#DynamoDB Streams}

-   Any change (Create, Update, Delete) can be sent to a stream
-   Stream can be read by AWS Lambda
-   Could use for populating ElasticSearch; cross region replication
    -   NEed to set up IAM permissions for this to work!
-   24 hour data retention

### Dynamo Transactions {#Dynamo Transactions}

-   Can update create delete multiple rown is different tables at same
    time in one txn
-   Write to all or no tables!

### Security {#Security}

-   VPC endpoints available so can access DynamoDB without internet
-   Encryption at rest using KMS; in transit using SSL/TLS

API Gateway {#API Gateway}
-----------

-   Supports API versioning and different environments
-   Handles security (Authentication and Authorization)
-   Can create API keys, handle request throttling (overall / burst
    capacity)
-   Supports caching, and SDK/API doc generation (import and export)
-   Can integrate with lambda, ec2, other endpoints etc.
-   Use stage variables to automatically invoke the right lambda (via
    lambda aliases)
    -   e.g. variable is `alias=DEV`
-   A []{#stage}**stage** is an environment
    -   E.g. create a DEV stage and deploy to that
-   Use []{#Mapping Templates}**Mapping Templates** (written in Velocity
    (VTL)) for:
    -   Renaming params
    -   Adding headers
    -   Modify body content (convert xml to json etc.)
    -   etc.
    -   These templates sit between API gateway and service (Lambda /
        EC2 etc.)
-   Exporting as Swagger/OpenAPI allows us to model API gateway infra as
    code
-   Cache is defined at stage level
-   Can use `Cache-Control: max-age=0` header to avoid requesting a
    cached response
    -   Required proper IAM authorisation to do this
-   Requests and responses are logged into CloudWatch; can also enable
    X-Ray tracing
-   CORS must be enabled to receive calls from another domain (3 Access
    Control headers)
-   Use Lambda Authorizer for Oauth/SAML etc.
-   Use IAM for AWS \<-\> AWS API usage

### Cognito {#Cognito}

-   Use Cognito User Pools for Authentication if you want to manage your
    own user pool (or use Google, FB)
-   Use Cognito Identity Pools (federated identity)
    -   Provide AWS creds to access AWS resources directly
    -   Integrate with Cognito User Pools as an identity provider (or
        use Google, FB)
    -   e.g. to provide temporary S3 bucket access to someone using FB
        login
    -   Uses STS service to get temporary credentials
-   Cognito Sync can integrate with device
-   Cognito Sync (now AppSync) can be used to store preferences, config,
    app state

AWS SAM (Serverless Application Model) {#AWS SAM (Serverless Application Model)}
--------------------------------------

-   Uses YAML format to generate CloudFormation for Serverless apps
-   Template will have a reference to code in S3
-   SAM can help you run Lambda, API Gateway, DynamoDB locally!
    -   Use aws-sam-cli (GitHub download) for local development
-   Transform Header indicates it\'s a SAM template:
    `'AWS:: Serverless-2016-10-31'`
-   Write code:
    -   `AWS: Serverless::Function`
    -   `AWS: Serverless::Api`
    -   `AWS: Serverless::SimpleTable`
-   Deploy:
    -   `aws cloudformation package` - generates CloudFormation yaml
        from SAM template and uploads code to S3
    -   `aws cloudformation deploy` - updates our stack with
        created/updated changeset
-   SAM Policy Templates
    -   List of templates that apply permissions to your Lambda
        Functions
    -   e.g. S3ReadPolicy, DynamoDBCrudPolicy, SQSPollerPolicy

AWS Step Functions {#AWS Step Functions}
------------------

-   Represent serverlesss workflow as JSON state machine
-   Can implement human approval feature
-   Features: sequence, parallel, conditions, timeouts, error handling,
    etc.

AWS SWF: Simple Workflow Service {#AWS SWF: Simple Workflow Service}
--------------------------------

-   Similar to Step Functions; but older and runs on EC2
-   Does allow external signals to intervene in processes; but in
    general SWF is deprecated

ECS, ECR & Fargate: Docker in AWS {#ECS, ECR & Fargate: Docker in AWS}
---------------------------------

-   ECS Clusters are logical groupings of EC2 instances
    -   EC2 instances run a special AMI, made specifically for ECS
-   ECS instances run the ECS agent (docker container)
-   ECS agent registers the instance to the ECS cluster
-   EC2 instances set ECS\_CLUSTER and ECS\_BACKEND\_HOST vars in user
    data (stored in `/etc/ecs/ecs.config`)
-   ECS Task Definition is json description of how to run some related
    Docker containers (like a Dockerfile)
    -   Contains image name, port binding, memory, cpu, env vars,
        networking, etc.
-   Tasks need an IAM role
    -   Need to set `ECS_ENABLE_TASK_IAM_ROLE=true`
-   ECS Service specifies how many tasks should be run and how they
    should be run
    -   Ensures the number of tasks desired is running across our fleet
        of EC2 instances
-   Services can be:
    -   REPLICA: As many instances as possible across cluster
    -   DAEMON: Try to run one instance on each EC2 host in ECS cluster
-   XRay can be run as a Daemon container or as a sidecar container (1
    per container)
-   ALB can be set up with dynamic port forwarding, as unless specified
    in task defn, containers will get random host port binding
-   Can only add a load balancer on service creation
-   ECR is a private Docker image repository
    -   Access is controlled through IAM
    -   Need to run `aws ecr get-login` to enable push and pull
-   Fargate avoids the need to manage EC2 instances manually
    -   Just create task definitions, and to scale, increase the task
        number
    -   If you want XRay, need to use sidecar pattern here (container
        port=2000; protocol=udp)
-   Other containers need env var `AWS_XRAY_DAEMON_ADDRESS`
-   Can run Elastic Beanstalk ion single & Multi Docker Container mode
    -   Multi allows multiple containers per EC2 instance in EB
    -   Just need to provide Dockerrun.aws.json at root of source code
    -   Will create ALB, ASG, etc.

AWS Security & Encryption: KMS, SSM, IAM, SKS {#AWS Security & Encryption: KMS, SSM, IAM, SKS}
---------------------------------------------

-   Certificate used for encryption in flight (SSL)
-   Data key used for encryption at rest
    -   Service must have access to key
-   Client side encryption means server never does encrypt / decrypt
    data
    -   Could leverage envelope encryption
-   KMS provides easy way to control access to data
    -   Fully integrated with IAM for authorization (ensure lambdas etc.
        have correct roles / policies!)
    -   CMK (customer master key can never be retrieved; it can be
        rotated for extra security)
    -   KMS can only encrypt up to 4KB of data per call
    -   For data \> 4KB, use envelope encryption
    -   Can use CloudTrail to audit key usage
-   Envelope Encryption can be done using AWS Encryption SDK
    -   `GenerateDataKey` API
    -   Can be installed as a CLI tool
    -   Adds encrypted data key to file as \'envelope\'
    -   KMS can then decrypt the data key and send it back in plain text
        (checking IAM permissions)
    -   Decryption then can be done client-side
-   AWS Parameter Store
    -   Secure storage for configuration and secrets
    -   Optional seamless encryption using KMS
    -   Provides version tracking and CloudWatch Events for
        notifications
    -   Integrates with CloudFormation
    -   Can organise parameters in a hierarchy
        -   Useful for separating different set of parameters for
            dev/prod etc.
-   IAM Policy Evaluation
    -   Explicit Deny takes precedence over explicit Allow
    -   S3 Bucket Policies and IAM Policies are evaluated as a Union
        (explicit Deny in either =\> Deny)
-   Dynamic IAM policies
    -   One policy that uses policy variable `${aws:username}`
        -   This would allow users to have their own folder in an S3
            bucket without creating a policy per user
-   IAM Inline vs Managed Policies
    -   AWS Managed Policies
        -   Good for power users and admins
        -   Updated in case of new services / APIs
        -   Not very granular: tend to be full access or read-only
            access
    -   Customer Managed Policy
        -   Best practice; reusable; can be applied to many IAM
            Principals
        -   Version control + rollback
    -   Inline Policies
        -   Apply to a single IAM Principal (create inline policies for
            a particular user/role)
        -   Policy deleted if you delete the Principal

ACM AWS Certificate Manager {#ACM AWS Certificate Manager}
---------------------------

-   Can provision and renew public and SSL certificates for you free of
    cost
-   Can load them to Load Balances, CF distributions, APIs on API
    Gateways
-   Terminating SSL at ALB means less CPU cost in EC2 (as uses HTTP
    between EC2 and ALB)

Practice Test 1 {#Practice Test 1}
===============

-   Need to learn sections of a CloudFormation template
-   Need to revise KMS and STS
-   Revise Cognito User / Identity Pools

Practice Test 2 {#Practice Test 2}
===============

-   Need to learn CodeDeploy, CodeBuild & CodePipeline

Practice Test 3 {#Practice Test 3}
===============

-   Stage variables are part of API gateway; aliases point to lambda
    versions
-   Need to revise Envelope Encryption (uses GenerateDataKey API call)
-   Need to revise lambda file size limits
    -   (zipped=50MB; uncompressed 250MB)
-   Need to check URL for EC2 meta data
    -   `http://169.254.169.254/latest/meta-data`
-   CloudWatch detailed monitoring allows 1 min resolution; normal is 5
    min
-   Need to understand Lambda and DLQ retry behaviour:
    <https://docs.aws.amazon.com/lambda/latest/dg/dlq.html>
    -   aws invoke command can take `invocation-type=Event`, which will
        invoke lambda asynchronously

Practice Test 4 {#Practice Test 4}
===============

-   NB CloudWatch standard metrics do not cover memory utilisation: need
    a custom metric
-   Need to revise KMS/ encryption headers
-   Need to revise CloudFormation: GetAtt, Ref, ImportValue, etc.
-   NB There is no PurgeTable command in DynamoDB; need to Delete and
    re-create table
-   SQS can consume up to 10 msgs at one time
-   Need to revise different types of deployment for CodeDeploy and
    Elastic Beanstalk

Extra Practice Questions {#Extra Practice Questions}
========================

-   Kinesis shards, KCL and number of EC2 instances
    -   At most one KCL instance per shard
-   Need to revise Dynamo GSIs
-   Need to revise \``--page-size` and `--max-size` CLI options etc.

Morning Revision {#Morning Revision}
================

-   CF templates and intrinsic functions
-   KMS
-   Elastic Beanstalk deployments
    -   NB CodeDeploy supports In-place deployment or Blue/Green
-   By default, Lambdas do not have VPC connectivity; need to set this
    and assign a security group to give them access
