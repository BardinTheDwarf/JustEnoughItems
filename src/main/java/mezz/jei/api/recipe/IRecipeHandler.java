package mezz.jei.api.recipe;

import javax.annotation.Nonnull;

/**
 * An IRecipeHandler provides information about one Recipe Class.
 */
public interface IRecipeHandler<T> {

	/** Returns the class of the Recipe handled by this IRecipeHandler. */
	@Nonnull
	Class<T> getRecipeClass();

	/** Returns the category of this recipe. */
	@Nonnull
	Class<? extends IRecipeCategory> getRecipeCategoryClass();

	/** Returns a recipe wrapper for the given recipe. */
	@Nonnull
	IRecipeWrapper getRecipeWrapper(@Nonnull T recipe);

	/** Returns true if a recipe is valid and can be used. */
	boolean isRecipeValid(@Nonnull T recipe);
}
