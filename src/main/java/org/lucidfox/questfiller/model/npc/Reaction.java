package org.lucidfox.questfiller.model.npc;

public enum Reaction {
	HOSTILE(-1),
	NEUTRAL(0),
	FRIENDLY(1);
	
	private final int value;
	
	Reaction(final int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return Integer.toString(value);
	}
}