package models;

// Generated 5 Apr, 2016 3:49:22 PM by Hibernate Tools 4.3.1

/**
 * EventLicenseMappingId generated by hbm2java
 */
public class EventLicenseMappingId implements java.io.Serializable {

	private int eventIdEventId;
	private int licenseIdLicenseId;

	public EventLicenseMappingId() {
	}

	public EventLicenseMappingId(int eventIdEventId, int licenseIdLicenseId) {
		this.eventIdEventId = eventIdEventId;
		this.licenseIdLicenseId = licenseIdLicenseId;
	}

	public int getEventIdEventId() {
		return this.eventIdEventId;
	}

	public void setEventIdEventId(int eventIdEventId) {
		this.eventIdEventId = eventIdEventId;
	}

	public int getLicenseIdLicenseId() {
		return this.licenseIdLicenseId;
	}

	public void setLicenseIdLicenseId(int licenseIdLicenseId) {
		this.licenseIdLicenseId = licenseIdLicenseId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EventLicenseMappingId))
			return false;
		EventLicenseMappingId castOther = (EventLicenseMappingId) other;

		return (this.getEventIdEventId() == castOther.getEventIdEventId())
				&& (this.getLicenseIdLicenseId() == castOther
						.getLicenseIdLicenseId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEventIdEventId();
		result = 37 * result + this.getLicenseIdLicenseId();
		return result;
	}

}
