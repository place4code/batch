package com.place4code.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

/**
Intermediate Processor:
Ein gängiges Paradigma bei der Stapelverarbeitung besteht darin, Daten aufzunehmen,
sie umzuwandeln und sie dann über die Pipeline an eine andere Stelle weiterzuleiten.
Hier müssen Sie einen einfachen Transformator schreiben, der die Namen in Großbuchstaben umwandelt.

PersonItemProcessor implementiert die ItemProcessor-Schnittstelle von Spring Batch.
Gemäß der Schnittstelle erhalten Sie ein eingehendes Person-Objekt,
das Sie anschließend in eine Person in Großbuchstaben umwandeln.
*/
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName);

        log.info("Konvertierung (" + person + ") in (" + transformedPerson + ")");

        return transformedPerson;
    }

}