# IBAN Aleatory Generator Tool

IBAN Generator Tool is a Library that helps you generate random IBAN values based on chosen supported Countries.
You might better understand about IBAN accessing the documentation on the web (Wikipedia, please follow the link below).
https://en.wikipedia.org/wiki/International_Bank_Account_Number

## Features
- Provide functionality to generate valid IBAN's for different countries.
- The IBAN generator tool ensures that each IBAN value generated will be unique within a specific instance of the tool.
- The tool should be used as a library (simple jar).

## Dependencies
- There are no dependencies for the project.

## Documentation

- See the current [Javadoc] and [reference docs].
- You may generate the javadocs by executing the follow maven command "mvn javadoc:javadoc".

## Usage
- To generate a Random IBAN value you'll need a instance from the class ```com.iax.iban.IbanGenerator``` and then call the public method ```randomIBAN```. You should pass as an argument, the desired Country using one of the instances of the enumeration ```com.iax.iban.SupportedCountry```.
- You may also validate IBAN values using the validator ```com.iax.iban.IbanValidator```, just call the static method ```isValid``` passing the IBAN String value as parameter.

## Build from Source

1. Clone the repository from GitHub:

    ```sh
    $ git clone https://github.com/isaquexavier/iban-gen-tool.git
    ```

2. Navigate into the cloned repository directory:

    ```sh
    $ cd iban-gen-tool
    ```

3. The project uses [Maven] to build:

    ```sh
    $ ./mvn -e clean install
    ```
        
4. Install the generated jar into your local Maven cache (optional)

    ```sh
    $ ./mvn install:install-file -Dfile=<path-to-file> -DgroupId=<group-id> \
         -DartifactId=<artifact-id> -Dversion=<version> -Dpackaging=<packaging>
    ```

