package ebidrive.restandroidexample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("id")
    private int studentId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("marks")
    private Double marks;

}
