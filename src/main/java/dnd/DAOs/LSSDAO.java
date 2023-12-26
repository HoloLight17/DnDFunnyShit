package dnd.DAOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Setter
class Ac {
    @JsonProperty("value")
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

}

@Setter
class Acrobatics {
    @JsonProperty("baseStat")
    String baseStat;
    @JsonProperty("name")
    String name;
    @JsonProperty("label")
    String label;
    @JsonProperty("isProf")
    int isProf;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

}

@Setter
class Age {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

}

@Setter
class Alignment {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

}

@Setter
class Allies {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

}

class AnimalHandling {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Arcana {
    String baseStat;
    String name;
    String label;
    int isProf;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

    public void setIsProf(int isProf) {
        this.isProf = isProf;
    }
}

class Athletics {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Attacks {
    Value value;
    int size;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Attrs {
    String id;
    String textName;
    String href;
    String target;
    Object myclass;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("textName")
    public String getTextName() {
        return this.textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    @JsonProperty("href")
    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("target")
    public String getTarget() {
        return this.target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @JsonProperty("class")
    public Object getMyclass() {
        return this.myclass;
    }

    public void setMyclass(Object myclass) {
        this.myclass = myclass;
    }
}

class Available {
    ArrayList<String> classes;

    @JsonProperty("classes")
    public ArrayList<String> getClasses() {
        return this.classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }
}

class Avatar {
    String jpeg;
    String webp;

    @JsonProperty("jpeg")
    public String getJpeg() {
        return this.jpeg;
    }

    public void setJpeg(String jpeg) {
        this.jpeg = jpeg;
    }

    @JsonProperty("webp")
    public String getWebp() {
        return this.webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }
}

class Background {
    String name;
    String label;
    String value;
    int size;
    boolean isHidden;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class Base {
    String name;
    String label;
    String value;
    String code;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

class Bonds {
    Value value;
    int size;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class BonusesSkills {
}

class BonusesStats {
}

class Cha {
    String name;
    String label;
    int score;
    int modifier;
    int check;
    boolean isProf;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("score")
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @JsonProperty("modifier")
    public int getModifier() {
        return this.modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    @JsonProperty("check")
    public int getCheck() {
        return this.check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    @JsonProperty("isProf")
    public boolean getIsProf() {
        return this.isProf;
    }

    public void setIsProf(boolean isProf) {
        this.isProf = isProf;
    }
}

class CharClass {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Coins {
    Gp gp;
    Total total;
    Sp sp;
    Cp cp;
    Pp pp;
    Ep ep;

    @JsonProperty("gp")
    public Gp getGp() {
        return this.gp;
    }

    public void setGp(Gp gp) {
        this.gp = gp;
    }

    @JsonProperty("total")
    public Total getTotal() {
        return this.total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    @JsonProperty("sp")
    public Sp getSp() {
        return this.sp;
    }

    public void setSp(Sp sp) {
        this.sp = sp;
    }

    @JsonProperty("cp")
    public Cp getCp() {
        return this.cp;
    }

    public void setCp(Cp cp) {
        this.cp = cp;
    }

    @JsonProperty("pp")
    public Pp getPp() {
        return this.pp;
    }

    public void setPp(Pp pp) {
        this.pp = pp;
    }

    @JsonProperty("ep")
    public Ep getEp() {
        return this.ep;
    }

    public void setEp(Ep ep) {
        this.ep = ep;
    }
}

class Con {
    String name;
    String label;
    int score;
    int modifier;
    int check;
    boolean isProf;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("score")
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @JsonProperty("modifier")
    public int getModifier() {
        return this.modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    @JsonProperty("check")
    public int getCheck() {
        return this.check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    @JsonProperty("isProf")
    public boolean getIsProf() {
        return this.isProf;
    }

    public void setIsProf(boolean isProf) {
        this.isProf = isProf;
    }
}

class Content {
    String type;
    ArrayList<Content> content;
    ArrayList<Mark> marks;
    String text;
    Attrs attrs;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("content")
    public ArrayList<Content> getContent() {
        return this.content;
    }

    public void setContent(ArrayList<Content> content) {
        this.content = content;
    }

    @JsonProperty("marks")
    public ArrayList<Mark> getMarks() {
        return this.marks;
    }

    public void setMarks(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    @JsonProperty("text")
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("attrs")
    public Attrs getAttrs() {
        return this.attrs;
    }

    public void setAttrs(Attrs attrs) {
        this.attrs = attrs;
    }
}

class Cp {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Data {
    String type;
    ArrayList<Content> content;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("content")
    public ArrayList<Content> getContent() {
        return this.content;
    }

    public void setContent(ArrayList<Content> content) {
        this.content = content;
    }
}

class Deception {
    String baseStat;
    String name;
    String label;
    int isProf;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

    public void setIsProf(int isProf) {
        this.isProf = isProf;
    }
}

class Dex {
    String name;
    String label;
    int score;
    int modifier;
    int check;
    boolean isProf;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("score")
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @JsonProperty("modifier")
    public int getModifier() {
        return this.modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    @JsonProperty("check")
    public int getCheck() {
        return this.check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    @JsonProperty("isProf")
    public boolean getIsProf() {
        return this.isProf;
    }

    public void setIsProf(boolean isProf) {
        this.isProf = isProf;
    }
}

class Dmg {
    String value;

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Ep {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Equipment {
    Value value;
    int size;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Experience {
    String name;
    String label;
    int value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Eyes {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Features {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Flaws {
    Value value;
    int size;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Gp {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Hair {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Height {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class History {
    String baseStat;
    String name;
    String label;
    int isProf;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

    public void setIsProf(int isProf) {
        this.isProf = isProf;
    }
}

class HitDie {
    String value;

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class HpCurrent {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class HpDiceCurrent {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class HpDiceMulti {
}

class HpMax {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class HpMaxBonus {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class HpTemp {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Ideals {
    Value value;
    int size;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Info {
    CharClass charClass;
    Level level;
    Background background;
    PlayerName playerName;
    Race race;
    Alignment alignment;
    Experience experience;

    @JsonProperty("charClass")
    public CharClass getCharClass() {
        return this.charClass;
    }

    public void setCharClass(CharClass charClass) {
        this.charClass = charClass;
    }

    @JsonProperty("level")
    public Level getLevel() {
        return this.level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @JsonProperty("background")
    public Background getBackground() {
        return this.background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    @JsonProperty("playerName")
    public PlayerName getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(PlayerName playerName) {
        this.playerName = playerName;
    }

    @JsonProperty("race")
    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    @JsonProperty("alignment")
    public Alignment getAlignment() {
        return this.alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    @JsonProperty("experience")
    public Experience getExperience() {
        return this.experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}

class Initiative {
    String value;

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Insight {
    String baseStat;
    String name;
    String label;
    int isProf;
    Object customPassive;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

    public void setIsProf(int isProf) {
        this.isProf = isProf;
    }

    @JsonProperty("customPassive")
    public Object getCustomPassive() {
        return this.customPassive;
    }

    public void setCustomPassive(Object customPassive) {
        this.customPassive = customPassive;
    }
}

class Int {
    String name;
    String label;
    int score;
    int modifier;
    boolean isProf;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("score")
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @JsonProperty("modifier")
    public int getModifier() {
        return this.modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    @JsonProperty("isProf")
    public boolean getIsProf() {
        return this.isProf;
    }

    public void setIsProf(boolean isProf) {
        this.isProf = isProf;
    }
}

class Intimidation {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Investigation {
    String baseStat;
    String name;
    String label;
    int isProf;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

    public void setIsProf(int isProf) {
        this.isProf = isProf;
    }
}

class Items {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Level {
    String name;
    String label;
    int value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Mark {
    String type;
    Attrs attrs;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("attrs")
    public Attrs getAttrs() {
        return this.attrs;
    }

    public void setAttrs(Attrs attrs) {
        this.attrs = attrs;
    }
}

class Medicine {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Mod {
    String name;
    String label;
    String value;
    Object customModifier;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("customModifier")
    public Object getCustomModifier() {
        return this.customModifier;
    }

    public void setCustomModifier(Object customModifier) {
        this.customModifier = customModifier;
    }
}

class ModBonus {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Name {
    String value;

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Nature {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Notes1 {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Notes2 {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Notes3 {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Notes4 {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Notes5 {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Notes6 {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Perception {
    String baseStat;
    String name;
    String label;
    int isProf;
    int customPassive;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

    public void setIsProf(int isProf) {
        this.isProf = isProf;
    }

    @JsonProperty("customPassive")
    public int getCustomPassive() {
        return this.customPassive;
    }

    public void setCustomPassive(int customPassive) {
        this.customPassive = customPassive;
    }
}

class Performance {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Personality {
    Value value;
    int size;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Persuasion {
    String baseStat;
    String name;
    String label;
    int isProf;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

    public void setIsProf(int isProf) {
        this.isProf = isProf;
    }
}

class PlayerName {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Pp {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Prof {
    Value value;
    int size;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Quests {
    Value value;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

class Race {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Religion {
    String baseStat;
    String name;
    String label;
    int isProf;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("isProf")
    public int getIsProf() {
        return this.isProf;
    }

    public void setIsProf(int isProf) {
        this.isProf = isProf;
    }
}

class Resource1649086905550 {
    String id;
    String name;
    int current;
    int max;
    String location;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("current")
    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @JsonProperty("max")
    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class Resource1650979411217 {
    String id;
    String name;
    int current;
    int max;
    boolean isShortRest;
    String icon;
    boolean isLongRest;
    String location;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("current")
    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @JsonProperty("max")
    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @JsonProperty("isShortRest")
    public boolean getIsShortRest() {
        return this.isShortRest;
    }

    public void setIsShortRest(boolean isShortRest) {
        this.isShortRest = isShortRest;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("isLongRest")
    public boolean getIsLongRest() {
        return this.isLongRest;
    }

    public void setIsLongRest(boolean isLongRest) {
        this.isLongRest = isLongRest;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class Resource1650980367881 {
    String id;
    String name;
    int current;
    int max;
    boolean isLongRest;
    String icon;
    String location;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("current")
    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @JsonProperty("max")
    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @JsonProperty("isLongRest")
    public boolean getIsLongRest() {
        return this.isLongRest;
    }

    public void setIsLongRest(boolean isLongRest) {
        this.isLongRest = isLongRest;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class Resource1651654203017 {
    String id;
    String name;
    int current;
    int max;
    boolean isLongRest;
    String icon;
    String location;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("current")
    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @JsonProperty("max")
    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @JsonProperty("isLongRest")
    public boolean getIsLongRest() {
        return this.isLongRest;
    }

    public void setIsLongRest(boolean isLongRest) {
        this.isLongRest = isLongRest;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class Resource1660747777990 {
    String id;
    String name;
    int current;
    int max;
    String location;
    boolean isShortRest;
    String icon;
    boolean isLongRest;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("current")
    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @JsonProperty("max")
    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("isShortRest")
    public boolean getIsShortRest() {
        return this.isShortRest;
    }

    public void setIsShortRest(boolean isShortRest) {
        this.isShortRest = isShortRest;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("isLongRest")
    public boolean getIsLongRest() {
        return this.isLongRest;
    }

    public void setIsLongRest(boolean isLongRest) {
        this.isLongRest = isLongRest;
    }
}

class Resource1697309236718 {
    String id;
    String name;
    int current;
    int max;
    String location;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("current")
    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @JsonProperty("max")
    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

class Resource1697395389786 {
    String id;
    String name;
    int current;
    int max;
    String location;
    boolean isLongRest;
    String icon;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("current")
    public int getCurrent() {
        return this.current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    @JsonProperty("max")
    public int getMax() {
        return this.max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("isLongRest")
    public boolean getIsLongRest() {
        return this.isLongRest;
    }

    public void setIsLongRest(boolean isLongRest) {
        this.isLongRest = isLongRest;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

class Resources {
    Resource1649086905550 resource1649086905550;
    Resource1650979411217 resource1650979411217;
    Resource1650980367881 resource1650980367881;
    Resource1651654203017 resource1651654203017;
    Resource1660747777990 resource1660747777990;
    Resource1697309236718 resource1697309236718;
    Resource1697395389786 resource1697395389786;

    @JsonProperty("resource-1649086905550")
    public Resource1649086905550 getResource1649086905550() {
        return this.resource1649086905550;
    }

    public void setResource1649086905550(Resource1649086905550 resource1649086905550) {
        this.resource1649086905550 = resource1649086905550;
    }

    @JsonProperty("resource-1650979411217")
    public Resource1650979411217 getResource1650979411217() {
        return this.resource1650979411217;
    }

    public void setResource1650979411217(Resource1650979411217 resource1650979411217) {
        this.resource1650979411217 = resource1650979411217;
    }

    @JsonProperty("resource-1650980367881")
    public Resource1650980367881 getResource1650980367881() {
        return this.resource1650980367881;
    }

    public void setResource1650980367881(Resource1650980367881 resource1650980367881) {
        this.resource1650980367881 = resource1650980367881;
    }

    @JsonProperty("resource-1651654203017")
    public Resource1651654203017 getResource1651654203017() {
        return this.resource1651654203017;
    }

    public void setResource1651654203017(Resource1651654203017 resource1651654203017) {
        this.resource1651654203017 = resource1651654203017;
    }

    @JsonProperty("resource-1660747777990")
    public Resource1660747777990 getResource1660747777990() {
        return this.resource1660747777990;
    }

    public void setResource1660747777990(Resource1660747777990 resource1660747777990) {
        this.resource1660747777990 = resource1660747777990;
    }

    @JsonProperty("resource-1697309236718")
    public Resource1697309236718 getResource1697309236718() {
        return this.resource1697309236718;
    }

    public void setResource1697309236718(Resource1697309236718 resource1697309236718) {
        this.resource1697309236718 = resource1697309236718;
    }

    @JsonProperty("resource-1697395389786")
    public Resource1697395389786 getresource1697395389786() {
        return this.resource1697395389786;
    }

    public void setresource1697395389786(Resource1697395389786 resource1697395389786) {
        this.resource1697395389786 = resource1697395389786;
    }
}

public class LSSDAO {
    String jsonType;
    String template;
    Name name;
    String hiddenName;
    Info info;
    SubInfo subInfo;
    SpellsInfo spellsInfo;
    Spells spells;
    int proficiency;
    Stats stats;
    Saves saves;
    Skills skills;
    Vitality vitality;
    ArrayList<WeaponsList> weaponsList;
    Weapons weapons;
    Text text;
    Coins coins;
    Resources resources;
    BonusesSkills bonusesSkills;
    BonusesStats bonusesStats;
    ArrayList<Object> conditions;
    SkillBonuses skillBonuses;
    Date modifiedTime;
    boolean inspiration;
    String exhaustion;
    String id;
    Avatar avatar;

    @JsonProperty("jsonType")
    public String getJsonType() {
        return this.jsonType;
    }

    public void setJsonType(String jsonType) {
        this.jsonType = jsonType;
    }

    @JsonProperty("template")
    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty("name")
    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("hiddenName")
    public String getHiddenName() {
        return this.hiddenName;
    }

    public void setHiddenName(String hiddenName) {
        this.hiddenName = hiddenName;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return this.info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("subInfo")
    public SubInfo getSubInfo() {
        return this.subInfo;
    }

    public void setSubInfo(SubInfo subInfo) {
        this.subInfo = subInfo;
    }

    @JsonProperty("spellsInfo")
    public SpellsInfo getSpellsInfo() {
        return this.spellsInfo;
    }

    public void setSpellsInfo(SpellsInfo spellsInfo) {
        this.spellsInfo = spellsInfo;
    }

    @JsonProperty("spells")
    public Spells getSpells() {
        return this.spells;
    }

    public void setSpells(Spells spells) {
        this.spells = spells;
    }

    @JsonProperty("proficiency")
    public int getProficiency() {
        return this.proficiency;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return this.stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @JsonProperty("saves")
    public Saves getSaves() {
        return this.saves;
    }

    public void setSaves(Saves saves) {
        this.saves = saves;
    }

    @JsonProperty("skills")
    public Skills getSkills() {
        return this.skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    @JsonProperty("vitality")
    public Vitality getVitality() {
        return this.vitality;
    }

    public void setVitality(Vitality vitality) {
        this.vitality = vitality;
    }

    @JsonProperty("weaponsList")
    public ArrayList<WeaponsList> getWeaponsList() {
        return this.weaponsList;
    }

    public void setWeaponsList(ArrayList<WeaponsList> weaponsList) {
        this.weaponsList = weaponsList;
    }

    @JsonProperty("weapons")
    public Weapons getWeapons() {
        return this.weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    @JsonProperty("text")
    public Text getText() {
        return this.text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    @JsonProperty("coins")
    public Coins getCoins() {
        return this.coins;
    }

    public void setCoins(Coins coins) {
        this.coins = coins;
    }

    @JsonProperty("resources")
    public Resources getResources() {
        return this.resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    @JsonProperty("bonusesSkills")
    public BonusesSkills getBonusesSkills() {
        return this.bonusesSkills;
    }

    public void setBonusesSkills(BonusesSkills bonusesSkills) {
        this.bonusesSkills = bonusesSkills;
    }

    @JsonProperty("bonusesStats")
    public BonusesStats getBonusesStats() {
        return this.bonusesStats;
    }

    public void setBonusesStats(BonusesStats bonusesStats) {
        this.bonusesStats = bonusesStats;
    }

    @JsonProperty("conditions")
    public ArrayList<Object> getConditions() {
        return this.conditions;
    }

    public void setConditions(ArrayList<Object> conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("skillBonuses")
    public SkillBonuses getSkillBonuses() {
        return this.skillBonuses;
    }

    public void setSkillBonuses(SkillBonuses skillBonuses) {
        this.skillBonuses = skillBonuses;
    }

    @JsonProperty("modifiedTime")
    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @JsonProperty("inspiration")
    public boolean getInspiration() {
        return this.inspiration;
    }

    public void setInspiration(boolean inspiration) {
        this.inspiration = inspiration;
    }

    @JsonProperty("exhaustion")
    public String getExhaustion() {
        return this.exhaustion;
    }

    public void setExhaustion(String exhaustion) {
        this.exhaustion = exhaustion;
    }

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("avatar")
    public Avatar getAvatar() {
        return this.avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
}

class Save {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Saves {
    Str str;
    Dex dex;
    Con con;
    Int myint;
    Wis wis;
    Cha cha;

    @JsonProperty("str")
    public Str getStr() {
        return this.str;
    }

    public void setStr(Str str) {
        this.str = str;
    }

    @JsonProperty("dex")
    public Dex getDex() {
        return this.dex;
    }

    public void setDex(Dex dex) {
        this.dex = dex;
    }

    @JsonProperty("con")
    public Con getCon() {
        return this.con;
    }

    public void setCon(Con con) {
        this.con = con;
    }

    @JsonProperty("int")
    public Int getMyint() {
        return this.myint;
    }

    public void setMyint(Int myint) {
        this.myint = myint;
    }

    @JsonProperty("wis")
    public Wis getWis() {
        return this.wis;
    }

    public void setWis(Wis wis) {
        this.wis = wis;
    }

    @JsonProperty("cha")
    public Cha getCha() {
        return this.cha;
    }

    public void setCha(Cha cha) {
        this.cha = cha;
    }
}

class SkillBonuses {
}

class Skills {
    Acrobatics acrobatics;
    Investigation investigation;
    Athletics athletics;
    Perception perception;
    Survival survival;
    Performance performance;
    Intimidation intimidation;
    History history;
    SleightOfHand sleightOfHand;
    Arcana arcana;
    Medicine medicine;
    Deception deception;
    Nature nature;
    Insight insight;
    Religion religion;
    Stealth stealth;
    Persuasion persuasion;
    AnimalHandling animalHandling;

    @JsonProperty("acrobatics")
    public Acrobatics getAcrobatics() {
        return this.acrobatics;
    }

    public void setAcrobatics(Acrobatics acrobatics) {
        this.acrobatics = acrobatics;
    }

    @JsonProperty("investigation")
    public Investigation getInvestigation() {
        return this.investigation;
    }

    public void setInvestigation(Investigation investigation) {
        this.investigation = investigation;
    }

    @JsonProperty("athletics")
    public Athletics getAthletics() {
        return this.athletics;
    }

    public void setAthletics(Athletics athletics) {
        this.athletics = athletics;
    }

    @JsonProperty("perception")
    public Perception getPerception() {
        return this.perception;
    }

    public void setPerception(Perception perception) {
        this.perception = perception;
    }

    @JsonProperty("survival")
    public Survival getSurvival() {
        return this.survival;
    }

    public void setSurvival(Survival survival) {
        this.survival = survival;
    }

    @JsonProperty("performance")
    public Performance getPerformance() {
        return this.performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    @JsonProperty("intimidation")
    public Intimidation getIntimidation() {
        return this.intimidation;
    }

    public void setIntimidation(Intimidation intimidation) {
        this.intimidation = intimidation;
    }

    @JsonProperty("history")
    public History getHistory() {
        return this.history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    @JsonProperty("sleight of hand")
    public SleightOfHand getsleightOfHand() {
        return this.sleightOfHand;
    }

    public void setsleightOfHand(SleightOfHand sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    @JsonProperty("arcana")
    public Arcana getArcana() {
        return this.arcana;
    }

    public void setArcana(Arcana arcana) {
        this.arcana = arcana;
    }

    @JsonProperty("medicine")
    public Medicine getMedicine() {
        return this.medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    @JsonProperty("deception")
    public Deception getDeception() {
        return this.deception;
    }

    public void setDeception(Deception deception) {
        this.deception = deception;
    }

    @JsonProperty("nature")
    public Nature getNature() {
        return this.nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    @JsonProperty("insight")
    public Insight getInsight() {
        return this.insight;
    }

    public void setInsight(Insight insight) {
        this.insight = insight;
    }

    @JsonProperty("religion")
    public Religion getReligion() {
        return this.religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    @JsonProperty("stealth")
    public Stealth getStealth() {
        return this.stealth;
    }

    public void setStealth(Stealth stealth) {
        this.stealth = stealth;
    }

    @JsonProperty("persuasion")
    public Persuasion getPersuasion() {
        return this.persuasion;
    }

    public void setPersuasion(Persuasion persuasion) {
        this.persuasion = persuasion;
    }

    @JsonProperty("animal handling")
    public AnimalHandling getanimalHandling() {
        return this.animalHandling;
    }

    public void setanimalHandling(AnimalHandling animalHandling) {
        this.animalHandling = animalHandling;
    }
}

class Skin {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class SleightOfHand {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Slots1 {
    int value;
    int filled;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @JsonProperty("filled")
    public int getFilled() {
        return this.filled;
    }

    public void setFilled(int filled) {
        this.filled = filled;
    }
}

class Slots2 {
    int value;
    int filled;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @JsonProperty("filled")
    public int getFilled() {
        return this.filled;
    }

    public void setFilled(int filled) {
        this.filled = filled;
    }
}

class Slots3 {
    int value;
    int filled;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @JsonProperty("filled")
    public int getFilled() {
        return this.filled;
    }

    public void setFilled(int filled) {
        this.filled = filled;
    }
}

class Slots4 {
    int value;
    int filled;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @JsonProperty("filled")
    public int getFilled() {
        return this.filled;
    }

    public void setFilled(int filled) {
        this.filled = filled;
    }
}

class Sp {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Speed {
    String value;

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Spells {
    Slots1 slots1;
    Slots2 slots2;
    Slots3 slots3;
    Slots4 slots4;

    @JsonProperty("slots-1")
    public Slots1 getSlots1() {
        return this.slots1;
    }

    public void setSlots1(Slots1 slots1) {
        this.slots1 = slots1;
    }

    @JsonProperty("slots-2")
    public Slots2 getSlots2() {
        return this.slots2;
    }

    public void setSlots2(Slots2 slots2) {
        this.slots2 = slots2;
    }

    @JsonProperty("slots-3")
    public Slots3 getSlots3() {
        return this.slots3;
    }

    public void setSlots3(Slots3 slots3) {
        this.slots3 = slots3;
    }

    @JsonProperty("slots-4")
    public Slots4 getSlots4() {
        return this.slots4;
    }

    public void setSlots4(Slots4 slots4) {
        this.slots4 = slots4;
    }
}

class SpellsInfo {
    Base base;
    Save save;
    Mod mod;
    Available available;

    @JsonProperty("base")
    public Base getBase() {
        return this.base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    @JsonProperty("save")
    public Save getSave() {
        return this.save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    @JsonProperty("mod")
    public Mod getMod() {
        return this.mod;
    }

    public void setMod(Mod mod) {
        this.mod = mod;
    }

    @JsonProperty("available")
    public Available getAvailable() {
        return this.available;
    }

    public void setAvailable(Available available) {
        this.available = available;
    }
}

class SpellsLevel0 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel1 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel2 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel3 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel4 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel5 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel6 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel7 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel8 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class SpellsLevel9 {
    Value value;
    boolean isHidden;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("isHidden")
    public boolean getIsHidden() {
        return this.isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }
}

class Stats {
    Str str;
    Dex dex;
    Con con;
    Int myint;
    Wis wis;
    Cha cha;

    @JsonProperty("str")
    public Str getStr() {
        return this.str;
    }

    public void setStr(Str str) {
        this.str = str;
    }

    @JsonProperty("dex")
    public Dex getDex() {
        return this.dex;
    }

    public void setDex(Dex dex) {
        this.dex = dex;
    }

    @JsonProperty("con")
    public Con getCon() {
        return this.con;
    }

    public void setCon(Con con) {
        this.con = con;
    }

    @JsonProperty("int")
    public Int getMyint() {
        return this.myint;
    }

    public void setMyint(Int myint) {
        this.myint = myint;
    }

    @JsonProperty("wis")
    public Wis getWis() {
        return this.wis;
    }

    public void setWis(Wis wis) {
        this.wis = wis;
    }

    @JsonProperty("cha")
    public Cha getCha() {
        return this.cha;
    }

    public void setCha(Cha cha) {
        this.cha = cha;
    }
}

class Stealth {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Str {
    String name;
    String label;
    int score;
    int modifier;
    boolean isProf;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("score")
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @JsonProperty("modifier")
    public int getModifier() {
        return this.modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    @JsonProperty("isProf")
    public boolean getIsProf() {
        return this.isProf;
    }

    public void setIsProf(boolean isProf) {
        this.isProf = isProf;
    }
}

class SubInfo {
    Age age;
    Height height;
    Weight weight;
    Eyes eyes;
    Skin skin;
    Hair hair;

    @JsonProperty("age")
    public Age getAge() {
        return this.age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    @JsonProperty("height")
    public Height getHeight() {
        return this.height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    @JsonProperty("weight")
    public Weight getWeight() {
        return this.weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @JsonProperty("eyes")
    public Eyes getEyes() {
        return this.eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    @JsonProperty("skin")
    public Skin getSkin() {
        return this.skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    @JsonProperty("hair")
    public Hair getHair() {
        return this.hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }
}

class Survival {
    String baseStat;
    String name;
    String label;

    @JsonProperty("baseStat")
    public String getBaseStat() {
        return this.baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

class Text {
    Prof prof;
    Attacks attacks;
    SpellsLevel1 spellsLevel1;
    Traits traits;
    Equipment equipment;
    Features features;
    Personality personality;
    Flaws flaws;
    Bonds bonds;
    Allies allies;
    Ideals ideals;
    Background background;
    Quests quests;
    SpellsLevel0 spellsLevel0;
    Items items;
    SpellsLevel2 spellsLevel2;
    Notes1 notes1;
    Notes2 notes2;
    Notes3 notes3;
    Notes4 notes4;
    SpellsLevel3 spellsLevel3;
    SpellsLevel4 spellsLevel4;
    SpellsLevel5 spellsLevel5;
    SpellsLevel6 spellsLevel6;
    SpellsLevel7 spellsLevel7;
    SpellsLevel8 spellsLevel8;
    SpellsLevel9 spellsLevel9;
    Notes5 notes5;
    Notes6 notes6;

    @JsonProperty("prof")
    public Prof getProf() {
        return this.prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    @JsonProperty("attacks")
    public Attacks getAttacks() {
        return this.attacks;
    }

    public void setAttacks(Attacks attacks) {
        this.attacks = attacks;
    }

    @JsonProperty("spells-level-1")
    public SpellsLevel1 getspellsLevel1() {
        return this.spellsLevel1;
    }

    public void setspellsLevel1(SpellsLevel1 spellsLevel1) {
        this.spellsLevel1 = spellsLevel1;
    }

    @JsonProperty("traits")
    public Traits getTraits() {
        return this.traits;
    }

    public void setTraits(Traits traits) {
        this.traits = traits;
    }

    @JsonProperty("equipment")
    public Equipment getEquipment() {
        return this.equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @JsonProperty("features")
    public Features getFeatures() {
        return this.features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    @JsonProperty("personality")
    public Personality getPersonality() {
        return this.personality;
    }

    public void setPersonality(Personality personality) {
        this.personality = personality;
    }

    @JsonProperty("flaws")
    public Flaws getFlaws() {
        return this.flaws;
    }

    public void setFlaws(Flaws flaws) {
        this.flaws = flaws;
    }

    @JsonProperty("bonds")
    public Bonds getBonds() {
        return this.bonds;
    }

    public void setBonds(Bonds bonds) {
        this.bonds = bonds;
    }

    @JsonProperty("allies")
    public Allies getAllies() {
        return this.allies;
    }

    public void setAllies(Allies allies) {
        this.allies = allies;
    }

    @JsonProperty("ideals")
    public Ideals getIdeals() {
        return this.ideals;
    }

    public void setIdeals(Ideals ideals) {
        this.ideals = ideals;
    }

    @JsonProperty("background")
    public Background getBackground() {
        return this.background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    @JsonProperty("quests")
    public Quests getQuests() {
        return this.quests;
    }

    public void setQuests(Quests quests) {
        this.quests = quests;
    }

    @JsonProperty("spells-level-0")
    public SpellsLevel0 getSpellsLevel0() {
        return this.spellsLevel0;
    }

    public void setSpellsLevel0(SpellsLevel0 spellsLevel0) {
        this.spellsLevel0 = spellsLevel0;
    }

    @JsonProperty("items")
    public Items getItems() {
        return this.items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @JsonProperty("spells-level-2")
    public SpellsLevel2 getspellsLevel2() {
        return this.spellsLevel2;
    }

    public void setspellsLevel2(SpellsLevel2 spellsLevel2) {
        this.spellsLevel2 = spellsLevel2;
    }

    @JsonProperty("notes-1")
    public Notes1 getnotes1() {
        return this.notes1;
    }

    public void setnotes1(Notes1 notes1) {
        this.notes1 = notes1;
    }

    @JsonProperty("notes-2")
    public Notes2 getnotes2() {
        return this.notes2;
    }

    public void setnotes2(Notes2 notes2) {
        this.notes2 = notes2;
    }

    @JsonProperty("notes-3")
    public Notes3 getnotes3() {
        return this.notes3;
    }

    public void setnotes3(Notes3 notes3) {
        this.notes3 = notes3;
    }

    @JsonProperty("notes-4")
    public Notes4 getnotes4() {
        return this.notes4;
    }

    public void setnotes4(Notes4 notes4) {
        this.notes4 = notes4;
    }

    @JsonProperty("spells-level-3")
    public SpellsLevel3 getspellsLevel3() {
        return this.spellsLevel3;
    }

    public void setspellsLevel3(SpellsLevel3 spellsLevel3) {
        this.spellsLevel3 = spellsLevel3;
    }

    @JsonProperty("spells-level-4")
    public SpellsLevel4 getspellsLevel4() {
        return this.spellsLevel4;
    }

    public void setspellsLevel4(SpellsLevel4 spellsLevel4) {
        this.spellsLevel4 = spellsLevel4;
    }

    @JsonProperty("spells-level-5")
    public SpellsLevel5 getspellsLevel5() {
        return this.spellsLevel5;
    }

    public void setspellsLevel5(SpellsLevel5 spellsLevel5) {
        this.spellsLevel5 = spellsLevel5;
    }

    @JsonProperty("spells-level-6")
    public SpellsLevel6 getspellsLevel6() {
        return this.spellsLevel6;
    }

    public void setspellsLevel6(SpellsLevel6 spellsLevel6) {
        this.spellsLevel6 = spellsLevel6;
    }

    @JsonProperty("spells-level-7")
    public SpellsLevel7 getspellsLevel7() {
        return this.spellsLevel7;
    }

    public void setspellsLevel7(SpellsLevel7 spellsLevel7) {
        this.spellsLevel7 = spellsLevel7;
    }

    @JsonProperty("spells-level-8")
    public SpellsLevel8 getspellsLevel8() {
        return this.spellsLevel8;
    }

    public void setspellsLevel8(SpellsLevel8 spellsLevel8) {
        this.spellsLevel8 = spellsLevel8;
    }

    @JsonProperty("spells-level-9")
    public SpellsLevel9 getspellsLevel9() {
        return this.spellsLevel9;
    }

    public void setspellsLevel9(SpellsLevel9 spellsLevel9) {
        this.spellsLevel9 = spellsLevel9;
    }

    @JsonProperty("notes-5")
    public Notes5 getNotes5() {
        return this.notes5;
    }

    public void setNotes5(Notes5 notes5) {
        this.notes5 = notes5;
    }

    @JsonProperty("notes6")
    public Notes6 getNotes6() {
        return this.notes6;
    }

    public void setNotes6(Notes6 notes6) {
        this.notes6 = notes6;
    }
}

class Total {
    int value;

    @JsonProperty("value")
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Traits {
    Value value;
    int size;

    @JsonProperty("value")
    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Value {
    Data data;
    String id;

    @JsonProperty("data")
    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Vitality {
    HpDiceCurrent hpDiceCurrent;
    HpDiceMulti hpDiceMulti;
    HpMax hpMax;
    HitDie hitDie;
    Initiative initiative;
    Speed speed;
    Ac ac;
    HpCurrent hpCurrent;
    HpTemp hpTemp;
    HpMaxBonus hpMaxBonus;
    boolean isDying;
    int deathFails;
    int deathSuccesses;

    @JsonProperty("hp-dice-current")
    public HpDiceCurrent gethpDiceCurrent() {
        return this.hpDiceCurrent;
    }

    public void sethpDiceCurrent(HpDiceCurrent hpDiceCurrent) {
        this.hpDiceCurrent = hpDiceCurrent;
    }

    @JsonProperty("hp-dice-multi")
    public HpDiceMulti gethpDiceMulti() {
        return this.hpDiceMulti;
    }

    public void sethpDiceMulti(HpDiceMulti hpDiceMulti) {
        this.hpDiceMulti = hpDiceMulti;
    }

    @JsonProperty("hp-max")
    public HpMax getHpMax() {
        return this.hpMax;
    }

    public void setHpMax(HpMax hpMax) {
        this.hpMax = hpMax;
    }

    @JsonProperty("hit-die")
    public HitDie gethitDie() {
        return this.hitDie;
    }

    public void sethitDie(HitDie hitDie) {
        this.hitDie = hitDie;
    }

    @JsonProperty("initiative")
    public Initiative getInitiative() {
        return this.initiative;
    }

    public void setInitiative(Initiative initiative) {
        this.initiative = initiative;
    }

    @JsonProperty("speed")
    public Speed getSpeed() {
        return this.speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    @JsonProperty("ac")
    public Ac getAc() {
        return this.ac;
    }

    public void setAc(Ac ac) {
        this.ac = ac;
    }

    @JsonProperty("hp-current")
    public HpCurrent gethpCurrent() {
        return this.hpCurrent;
    }

    public void sethpCurrent(HpCurrent hpCurrent) {
        this.hpCurrent = hpCurrent;
    }

    @JsonProperty("hp-temp")
    public HpTemp gethpTemp() {
        return this.hpTemp;
    }

    public void sethpTemp(HpTemp hpTemp) {
        this.hpTemp = hpTemp;
    }

    @JsonProperty("hp-max-bonus")
    public HpMaxBonus gethpMaxBonus() {
        return this.hpMaxBonus;
    }

    public void sethpMaxBonus(HpMaxBonus hpMaxBonus) {
        this.hpMaxBonus = hpMaxBonus;
    }

    @JsonProperty("isDying")
    public boolean getIsDying() {
        return this.isDying;
    }

    public void setIsDying(boolean isDying) {
        this.isDying = isDying;
    }

    @JsonProperty("deathFails")
    public int getDeathFails() {
        return this.deathFails;
    }

    public void setDeathFails(int deathFails) {
        this.deathFails = deathFails;
    }

    @JsonProperty("deathSuccesses")
    public int getDeathSuccesses() {
        return this.deathSuccesses;
    }

    public void setDeathSuccesses(int deathSuccesses) {
        this.deathSuccesses = deathSuccesses;
    }
}

class Weapons {
}

class WeaponsList {
    String id;
    Name name;
    Mod mod;
    Dmg dmg;
    boolean isProf;
    ModBonus modBonus;
    String ability;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("mod")
    public Mod getMod() {
        return this.mod;
    }

    public void setMod(Mod mod) {
        this.mod = mod;
    }

    @JsonProperty("dmg")
    public Dmg getDmg() {
        return this.dmg;
    }

    public void setDmg(Dmg dmg) {
        this.dmg = dmg;
    }

    @JsonProperty("isProf")
    public boolean getIsProf() {
        return this.isProf;
    }

    public void setIsProf(boolean isProf) {
        this.isProf = isProf;
    }

    @JsonProperty("modBonus")
    public ModBonus getModBonus() {
        return this.modBonus;
    }

    public void setModBonus(ModBonus modBonus) {
        this.modBonus = modBonus;
    }

    @JsonProperty("ability")
    public String getAbility() {
        return this.ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}

class Weight {
    String name;
    String label;
    String value;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("value")
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Wis {
    String name;
    String label;
    int score;
    int modifier;
    int check;
    boolean isProf;
    Object bonus;
    Object customModifier;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("score")
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @JsonProperty("modifier")
    public int getModifier() {
        return this.modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    @JsonProperty("check")
    public int getCheck() {
        return this.check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    @JsonProperty("isProf")
    public boolean getIsProf() {
        return this.isProf;
    }

    public void setIsProf(boolean isProf) {
        this.isProf = isProf;
    }

    @JsonProperty("bonus")
    public Object getBonus() {
        return this.bonus;
    }

    public void setBonus(Object bonus) {
        this.bonus = bonus;
    }

    @JsonProperty("customModifier")
    public Object getCustomModifier() {
        return this.customModifier;
    }

    public void setCustomModifier(Object customModifier) {
        this.customModifier = customModifier;
    }
}