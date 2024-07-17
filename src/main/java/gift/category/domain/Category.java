package gift.category.domain;

import gift.category.application.command.CategoryUpdateCommand;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, length = 7)
    private String color;

    private String description;

    @Column(nullable = false)
    private String imageUrl;

    public Category() {
    }

    public Category(String name, String color, String description, String imageUrl) {
        this(null, name, color, description, imageUrl);
    }

    public Category(Long id, String name, String color, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void update(CategoryUpdateCommand command) {
        this.name = command.name();
        this.color = command.color();
        this.description = command.description();
        this.imageUrl = command.imageUrl();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return id.equals(category.id) && name.equals(category.name) && color.equals(category.color) && Objects.equals(description, category.description) && imageUrl.equals(category.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, description, imageUrl);
    }

}
