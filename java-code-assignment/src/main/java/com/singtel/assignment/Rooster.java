package com.singtel.assignment;

public class Rooster extends Chiken {

	static final String gender = "Male";
	static final String defaultVoice = "Cock-a-doodle-doo";
	String voice;
	
	@Override
	public String getVoice() {
		return voice;
	}
	
	public String getGender(){
		return gender;
	}
	
	public String getVoiceByLanguage(String language){
		switch (language){
		case "Danish":
			voice = "kykyliky";
			break;
		case "Dutch":
			voice = "kukeleku";
			break;
		case "Finnish":
			voice = "kukko kiekuu";
			break;
		case "French":
			voice = "cocorico";
			break;
		case "German":
			voice = "kikeriki";
			break;
		case "Greek":
			voice = "kikiriki";
			break;
		case "Hebrew":
			voice = "coo-koo-ri-koo";
			break;
		case "Hungarian":
			voice = "kukuriku";
			break;
		case "Italian":
			voice = "chicchirichi";
			break;
		case "Japanese":
			voice = "ko-ke-kok-ko-o";
			break;
		case "Portuguese":
			voice = "cucurucu";
			break;
		case "Russian":
			voice = "kukareku";
			break;
		case "Swedish":
			voice = "kuckeliku";
			break;
		case "Turkish":
			voice = "kuk-kurri-kuuu";
			break;
		case "Urdu":
			voice = "kuklooku";
			break;
		default:
			voice = defaultVoice;
			break;	
		}
		
		return voice;
	}

}
