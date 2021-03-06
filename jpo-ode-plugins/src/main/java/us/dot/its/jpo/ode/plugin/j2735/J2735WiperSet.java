package us.dot.its.jpo.ode.plugin.j2735;

import us.dot.its.jpo.ode.plugin.asn1.Asn1Object;

public class J2735WiperSet extends Asn1Object {
	private static final long serialVersionUID = 1L;

	private Integer rateFront;
	private Integer rateRear;
	private J2735WiperStatus statusFront;
	private J2735WiperStatus statusRear;

	public Integer getRateFront() {
		return rateFront;
	}

	public void setRateFront(Integer rateFront) {
		this.rateFront = rateFront;
	}

	public Integer getRateRear() {
		return rateRear;
	}

	public void setRateRear(Integer rateRear) {
		this.rateRear = rateRear;
	}

	public J2735WiperStatus getStatusFront() {
		return statusFront;
	}

	public void setStatusFront(J2735WiperStatus statusFront) {
		this.statusFront = statusFront;
	}

	public J2735WiperStatus getStatusRear() {
		return statusRear;
	}

	public void setStatusRear(J2735WiperStatus statusRear) {
		this.statusRear = statusRear;
	}

}
