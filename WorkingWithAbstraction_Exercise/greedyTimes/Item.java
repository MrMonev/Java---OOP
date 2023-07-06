package WorkingWithAbstraction_Exercise.greedyTimes;

public class Item {

    private ItemType itemType;
    private String itemName;
    private long amount;

    public Item(ItemType itemType, String itemName, Long amount) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.amount = amount;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
