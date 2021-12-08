package com.yeahbutstill.demojavaoop.getterdansetter;

public class Category {
    private String id;
    private String name;
    private Long price;

    private Boolean expensive;

    public Category(String id, String name, Long price, Boolean expensive) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expensive = expensive;
    }

    public Category() {
    }


    /**
     * get field
     *
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return price
     */
    public Long getPrice() {
        return this.price;
    }

    /**
     * set field
     *
     * @param price
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * get field
     *
     * @return expensive
     */
    public Boolean isExpensive() {
        return this.expensive;
    }

    /**
     * set field
     *
     * @param expensive
     */
    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }
}
