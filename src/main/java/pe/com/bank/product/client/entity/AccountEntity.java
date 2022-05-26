package pe.com.bank.product.client.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

	private String id;
	private String accountNumber;
	private Double amount;
	private String dateOpen;
	private String amounttype;	
	private String productId;
	private String customerId;
}
