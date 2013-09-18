package edu.isi.serverbackend.feature.util;

import edu.isi.serverbackend.feature.DifferentOccupationFeature;
import edu.isi.serverbackend.feature.EitherNotPlaceFeature;
import edu.isi.serverbackend.feature.RarityFeature;
import edu.isi.serverbackend.linkedData.*;

public class Sample {
	protected LinkedDataConnection link;
	protected double rarity;
	protected float eitherNotPlace;
	protected float differentOccupation;
	protected float smallPlace;
	double interestingness;
	
	public Sample(LinkedDataConnection link){
		this.link = link;
		this.rarity = -1;
		this.eitherNotPlace = -1;
		this.differentOccupation = -1;
		this.smallPlace = -1;
		this.interestingness = 0;
		
	}
	
	public void evalutateFeature(){
		//rarity = RarityFeature.calculateRarity(link);
		eitherNotPlace = EitherNotPlaceFeature.isEitherNotPlace(link);
		differentOccupation = DifferentOccupationFeature.isDifferentOccupation(link);
		//smallPlace = SmallPlaceFeature.calculateSmallPlace(link);
	}

	public LinkedDataConnection getLink() {
		return link;
	}

	public void setLink(LinkedDataConnection link) {
		this.link = link;
	}

	public double getRarity() {
		return rarity;
	}

	public void setRarity(double rarity) {
		this.rarity = rarity;
	}

	public float getEitherNotPlace() {
		return eitherNotPlace;
	}

	public void setEitherNotPlace(float eitherNotPlace) {
		this.eitherNotPlace = eitherNotPlace;
	}

	public float getDifferentOccupation() {
		return differentOccupation;
	}

	public void setDifferentOccupation(float differentOccupation) {
		this.differentOccupation = differentOccupation;
	}

	public float getSmallPlace() {
		return smallPlace;
	}

	public void setSmallPlace(float smallPlace) {
		this.smallPlace = smallPlace;
	}
	
	public double getInterestingness() {
		return interestingness;
	}

	public void setInterestingness(double interestingness) {
		this.interestingness = interestingness;
	}

}
