package com.kafka_bundle.osgiA;


public class MessageRequest {
    private String message;

    // Constructor vacío (necesario para Spring)
    public MessageRequest() {}

    // Getter y Setter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
