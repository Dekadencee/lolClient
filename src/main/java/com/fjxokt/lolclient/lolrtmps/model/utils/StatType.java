package com.fjxokt.lolclient.lolrtmps.model.utils;

public enum StatType {

	TOTAL_SESSIONS_PLAYED("TOTAL_SESSIONS_PLAYED"), TOTAL_SESSIONS_LOST("TOTAL_SESSIONS_LOST"),
	TOTAL_SESSIONS_WON("TOTAL_SESSIONS_WON"), TOTAL_CHAMPION_KILL("TOTAL_CHAMPION_KILL"),
	TOTAL_DAMAGE_DEALT("TOTAL_DAMAGE_DEALT"), TOTAL_DAMAGE_TAKEN("TOTAL_DAMAGE_TAKEN"),
	MOST_CHAMPION_KILLS_PER_SESSION("MOST_CHAMPION_KILLS_PER_SESSION"), TOTAL_MINION_KILLS("TOTAL_MINION_KILLS"),
	TOTAL_DOUBLE_KILLS("TOTAL_DOUBLE_KILLS"), TOTAL_TRIPLE_KILLS("TOTAL_TRIPLE_KILLS"),
	TOTAL_QUADRA_KILLS("TOTAL_QUADRA_KILLS"), MAX_CHAMPIONS_KILLED("MAX_CHAMPIONS_KILLED"),
	MAX_NUM_DEATHS("MAX_NUM_DEATHS"), TOTAL_UNREAL_KILLS("TOTAL_UNREAL_KILLS"), TOTAL_FIRST_BLOOD("TOTAL_FIRST_BLOOD"),
	TOTAL_TIME_SPENT_DEAD("TOTAL_TIME_SPENT_DEAD"), TOTAL_ASSISTS("TOTAL_ASSISTS"),
	TOTAL_PHYSICAL_DAMAGE_DEALT("TOTAL_PHYSICAL_DAMAGE_DEALT"), TOTAL_MAGIC_DAMAGE_DEALT("TOTAL_MAGIC_DAMAGE_DEALT"),
	TOTAL_TURRETS_KILLED("TOTAL_TURRETS_KILLED"), MOST_SPELLS_CAST("MOST_SPELLS_CAST"), 
	TOTAL_GOLD_EARNED("TOTAL_GOLD_EARNED"), TOTAL_DEATHS_PER_SESSION("TOTAL_DEATHS_PER_SESSION"),
	TOTAL_PENTA_KILLS("TOTAL_PENTA_KILLS"),
	MINIONS_KILLED("MINIONS_KILLED"), CHAMPIONS_KILLED("CHAMPIONS_KILLED"), GOLD_EARNED("GOLD_EARNED"),
	PHYSICAL_DAMAGE_DEALT_PLAYER("PHYSICAL_DAMAGE_DEALT_PLAYER"), MAGIC_DAMAGE_TAKEN("MAGIC_DAMAGE_TAKEN"),
	ASSISTS("ASSISTS"), LARGEST_MULTI_KILL("LARGEST_MULTI_KILL"),
	ITEM0("ITEM0"), ITEM1("ITEM1"), ITEM2("ITEM2"), ITEM3("ITEM3"),
	PHYSICAL_DAMAGE_DEALT_TO_CHAMPIONS("PHYSICAL_DAMAGE_DEALT_TO_CHAMPIONS"),
	MAGIC_DAMAGE_DEALT_TO_CHAMPIONS("MAGIC_DAMAGE_DEALT_TO_CHAMPIONS"),
	NEUTRAL_MINIONS_KILLED("NEUTRAL_MINIONS_KILLED"), WIN("WIN"), LEVEL("LEVEL"),
	NUM_DEATHS("NUM_DEATHS"), MAGIC_DAMAGE_DEALT_PLAYER("MAGIC_DAMAGE_DEALT_PLAYER"),
	LARGEST_KILLING_SPREE("LARGEST_KILLING_SPREE"), LARGEST_CRITICAL_STRIKE("LARGEST_CRITICAL_STRIKE"),
	TOTAL_DAMAGE_DEALT_TO_CHAMPIONS("TOTAL_DAMAGE_DEALT_TO_CHAMPIONS"),
	PHYSICAL_DAMAGE_TAKEN("PHYSICAL_DAMAGE_TAKEN"), TURRETS_KILLED("TURRETS_KILLED");
	
	private String type;
	
	StatType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public static StatType getTypeFromString(String type) {
		StatType[] values = StatType.values();
		for (StatType s : values) {
			if (s.getType().equals(type)) {
				return s;
			}
		}
		return null;
	}
	
}