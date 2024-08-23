package mod.trindadedev.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;

import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputEditText;

import com.sketchware.remod.R;
import com.sketchware.remod.databinding.LayoutSkTextfieldBinding;

public class SKTextField extends LinearLayout {

     private LayoutSkTextfieldBinding binding; 

     public SKTextField(Context context) {
          this(context, null);
     }

     public SKTextField(Context context, @Nullable AttributeSet attrs) {
          this(context, attrs, 0);
     }

     public SKTextField(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
          super(context, attrs, defStyleAttr);
          binding = LayoutSkTextfieldBinding.inflate(LayoutInflater.from(context), this, true);
     }

     public String getHint() {
          return binding.textInputLayout.getHint().toString();
     }

     public void setHint(String hint) {
          binding.textInputLayout.setHint(hint);
     }

     public String getPlaceholderText() {
          return binding.textInputLayout.getPlaceholderText().toString();
     }

     public void setPlaceholderText(String placeholderText) {
          binding.textInputLayout.setPlaceholderText(placeholderText);
     }

     public void setStartIconDrawableRes(@DrawableRes int drawableRes) {
          binding.textInputLayout.setStartIconDrawable(ContextCompat.getDrawable(getContext(), drawableRes));
     }

     public String getText() {
          return binding.textInputEdittext.getText().toString();
     }

     public void setText(String text) {
          binding.textInputEdittext.setText(text);
     }
     
     public TextInputEditText getEditText() {
          return binding.textInputEdittext;
     }
     
     public TextInputLayout getInputLayout() {
          return binding.textInputLayout;
     }
}
