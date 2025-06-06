public class Pokemon {
    Integer pokedexId;
    String name;
    String species;
    Float height;
    Float weight;
    String types;
    String[] abilities;
    String hiddenAbility;
    Character gender;
    Integer statHp;
    Integer statAttack;
    Integer statDefense;
    Integer statSpecialAttack;
    Integer statSpecialDefense;
    Integer statSpeed;
    Integer statTotal;
    Boolean isShiny;

    //Registra o número e o Nome de um novo pokemon!
    public void registerNewPokemon(String name) {
        if (pokedexId == null) {
            pokedexId = 1;
        } else {
            pokedexId++;
        }
        setName(name);
        System.out.println("Você registrou o pokemon " + getName() + " de número " + getPokedexId());
    }

    public Integer getPokedexId() {
        return pokedexId;
    }

    public void setPokedexId(Integer pokedexId) {
        this.pokedexId = pokedexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    public String getHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(String hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getStatHp() {
        return statHp;
    }

    public void setStatHp(Integer statHp) {
        this.statHp = statHp;
    }

    public Integer getStatAttack() {
        return statAttack;
    }

    public void setStatAttack(Integer statAttack) {
        this.statAttack = statAttack;
    }

    public Integer getStatDefense() {
        return statDefense;
    }

    public void setStatDefense(Integer statDefense) {
        this.statDefense = statDefense;
    }

    public Integer getStatSpecialAttack() {
        return statSpecialAttack;
    }

    public void setStatSpecialAttack(Integer statSpecialAttack) {
        this.statSpecialAttack = statSpecialAttack;
    }

    public Integer getStatSpecialDefense() {
        return statSpecialDefense;
    }

    public void setStatSpecialDefense(Integer statSpecialDefense) {
        this.statSpecialDefense = statSpecialDefense;
    }

    public Integer getStatSpeed() {
        return statSpeed;
    }

    public void setStatSpeed(Integer statSpeed) {
        this.statSpeed = statSpeed;
    }

    public Integer getStatTotal() {
        return statTotal;
    }

    public void setStatTotal(Integer statTotal) {
        this.statTotal = statTotal;
    }

    public Boolean getShiny() {
        return isShiny;
    }

    public void setShiny(Boolean shiny) {
        isShiny = shiny;
    }
}

