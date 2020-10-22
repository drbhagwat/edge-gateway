package errors;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class RoleAlreadyExists extends Exception {
    private static final long serialVersionUID = 1L;
    public RoleAlreadyExists(String exception) {
        super(exception);
    }
}
