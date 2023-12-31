package com.tls.recipe.id;

import java.io.Serializable;
import java.util.Objects;

public class UserRecipeLogId implements Serializable {

    private int userId;
    private int recipeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRecipeLogId that = (UserRecipeLogId) o;
        return Objects.equals(userId, that.userId) &&
            Objects.equals(recipeId, that.recipeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, recipeId);
    }

}
