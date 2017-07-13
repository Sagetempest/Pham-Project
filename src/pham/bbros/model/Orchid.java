package pham.bbros.model;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Orchid {
	private int mID;
	private ImageView mFlowerImage;
	private String mFlowerName;
	private String mScent;
	private Color mColor;
	private int mSize;
	private double mPrice;
	private String mBloomingSeason;
	private int mQuantity;
	private String mDescription;
	
	protected Orchid(int iD, ImageView flowerImage, String flowerName, String scent, Color color, int size,
			double price, String bloomingSeason, int quantity, String description) {
		super();
		mID = iD;
		mFlowerImage = flowerImage;
		mFlowerName = flowerName;
		mScent = scent;
		mColor = color;
		mSize = size;
		mPrice = price;
		mBloomingSeason = bloomingSeason;
		mQuantity = quantity;
		mDescription = description;
	}
	public int getID() {
		return mID;
	}
	public ImageView getFlowerImage() {
		return mFlowerImage;
	}
	public String getFlowerName() {
		return mFlowerName;
	}
	public String getScent() {
		return mScent;
	}
	public Color getColor() {
		return mColor;
	}
	public int getSize() {
		return mSize;
	}
	public double getPrice() {
		return mPrice;
	}
	public String getBloomingSeason() {
		return mBloomingSeason;
	}
	public int getQuantity() {
		return mQuantity;
	}
	public String getDescription() {
		return mDescription;
	}
	public void setID(int iD) {
		mID = iD;
	}
	public void setFlowerImage(ImageView flowerImage) {
		mFlowerImage = flowerImage;
	}
	public void setFlowerName(String flowerName) {
		mFlowerName = flowerName;
	}
	public void setScent(String scent) {
		mScent = scent;
	}
	public void setColor(Color color) {
		mColor = color;
	}
	public void setSize(int size) {
		mSize = size;
	}
	public void setPrice(double price) {
		mPrice = price;
	}
	public void setBloomingSeason(String bloomingSeason) {
		mBloomingSeason = bloomingSeason;
	}
	public void setQuantity(int quantity) {
		mQuantity = quantity;
	}
	public void setDescription(String description) {
		mDescription = description;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mBloomingSeason == null) ? 0 : mBloomingSeason.hashCode());
		result = prime * result + ((mColor == null) ? 0 : mColor.hashCode());
		result = prime * result + ((mDescription == null) ? 0 : mDescription.hashCode());
		result = prime * result + ((mFlowerImage == null) ? 0 : mFlowerImage.hashCode());
		result = prime * result + ((mFlowerName == null) ? 0 : mFlowerName.hashCode());
		result = prime * result + mID;
		long temp;
		temp = Double.doubleToLongBits(mPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + mQuantity;
		result = prime * result + ((mScent == null) ? 0 : mScent.hashCode());
		result = prime * result + mSize;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orchid other = (Orchid) obj;
		if (mBloomingSeason == null) {
			if (other.mBloomingSeason != null)
				return false;
		} else if (!mBloomingSeason.equals(other.mBloomingSeason))
			return false;
		if (mColor == null) {
			if (other.mColor != null)
				return false;
		} else if (!mColor.equals(other.mColor))
			return false;
		if (mDescription == null) {
			if (other.mDescription != null)
				return false;
		} else if (!mDescription.equals(other.mDescription))
			return false;
		if (mFlowerImage == null) {
			if (other.mFlowerImage != null)
				return false;
		} else if (!mFlowerImage.equals(other.mFlowerImage))
			return false;
		if (mFlowerName == null) {
			if (other.mFlowerName != null)
				return false;
		} else if (!mFlowerName.equals(other.mFlowerName))
			return false;
		if (mID != other.mID)
			return false;
		if (Double.doubleToLongBits(mPrice) != Double.doubleToLongBits(other.mPrice))
			return false;
		if (mQuantity != other.mQuantity)
			return false;
		if (mScent == null) {
			if (other.mScent != null)
				return false;
		} else if (!mScent.equals(other.mScent))
			return false;
		if (mSize != other.mSize)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Orchid [mID=" + mID + ", mFlowerImage=" + mFlowerImage + ", mFlowerName=" + mFlowerName + ", mScent="
				+ mScent + ", mColor=" + mColor + ", mSize=" + mSize + ", mPrice=" + mPrice + ", mBloomingSeason="
				+ mBloomingSeason + ", mQuantity=" + mQuantity + ", mDescription=" + mDescription + "]";
	}
	
	
}
