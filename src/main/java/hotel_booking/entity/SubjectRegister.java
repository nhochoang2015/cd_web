package hotel_booking.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import hotel_booking.compositeKey.AccountSubjectKey;


@Entity
@Table(name = "MON_HOC_DANG_KY")
public class SubjectRegister {
		@EmbeddedId
		private AccountSubjectKey id;
		@ManyToOne
		@MapsId("accountID")
		@JoinColumn(name = "MA_TAI_KHOAN")
		private Account account;
		@ManyToOne
		@MapsId("subjectID")
		@JoinColumn(name = "MA_MON_HOC")
		private Subject subject;

		

		public SubjectRegister() {
			super();
		}

		public SubjectRegister(AccountSubjectKey id, Account account, Subject subject) {
			super();
			this.id = id;
			this.account = account;
			this.subject = subject;
		}


		public AccountSubjectKey getId() {
			return id;
		}

		public void setId(AccountSubjectKey id) {
			this.id = id;
		}

		public Subject getSubject() {
			return subject;
		}

		public void setSubject(Subject subject) {
			this.subject = subject;
		}

		public Account getAccount() {
			return account;
		}

		public void setAccount(Account account) {
			this.account = account;
		}

	

	}


