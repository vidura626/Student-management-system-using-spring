package lk.ijse.studentmanagementsystem.dto.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AddressDTO {
    String homeNo;
    String streetName;
    String city;
    String district;
    String postalCode;
}
