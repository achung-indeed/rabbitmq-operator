package com.indeed.operators.rabbitmq.model.crd.rabbitmq;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.sundr.builder.annotations.Buildable;

@Buildable(
        builderPackage = "io.fabric8.kubernetes.api.builder",
        editableEnabled = false
)
@JsonPropertyOrder({"name", "source", "destination"})
@JsonDeserialize(using = JsonDeserializer.None.class)
public class ShovelSpec {

    private final String name;
    private final SourceShovelSpec source;
    private final DestinationShovelSpec destination;

    @JsonCreator
    public ShovelSpec(
            @JsonProperty("name") final String name,
            @JsonProperty("source") final SourceShovelSpec source,
            @JsonProperty("destination") final DestinationShovelSpec destination
    ) {
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public SourceShovelSpec getSource() {
        return source;
    }

    public DestinationShovelSpec getDestination() {
        return destination;
    }
}