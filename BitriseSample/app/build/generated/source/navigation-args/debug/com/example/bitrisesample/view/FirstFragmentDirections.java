package com.example.bitrisesample.view;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.bitrisesample.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FirstFragmentDirections {
  private FirstFragmentDirections() {
  }

  @NonNull
  public static ActionFirstFragmentToSecondFragment actionFirstFragmentToSecondFragment(@NonNull String firstText) {
    return new ActionFirstFragmentToSecondFragment(firstText);
  }

  public static class ActionFirstFragmentToSecondFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFirstFragmentToSecondFragment(@NonNull String firstText) {
      if (firstText == null) {
        throw new IllegalArgumentException("Argument \"firstText\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("firstText", firstText);
    }

    @NonNull
    public ActionFirstFragmentToSecondFragment setFirstText(@NonNull String firstText) {
      if (firstText == null) {
        throw new IllegalArgumentException("Argument \"firstText\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("firstText", firstText);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("firstText")) {
        String firstText = (String) arguments.get("firstText");
        __result.putString("firstText", firstText);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_firstFragment_to_secondFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getFirstText() {
      return (String) arguments.get("firstText");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFirstFragmentToSecondFragment that = (ActionFirstFragmentToSecondFragment) object;
      if (arguments.containsKey("firstText") != that.arguments.containsKey("firstText")) {
        return false;
      }
      if (getFirstText() != null ? !getFirstText().equals(that.getFirstText()) : that.getFirstText() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getFirstText() != null ? getFirstText().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFirstFragmentToSecondFragment(actionId=" + getActionId() + "){"
          + "firstText=" + getFirstText()
          + "}";
    }
  }
}
