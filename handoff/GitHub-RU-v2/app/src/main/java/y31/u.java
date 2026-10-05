package y31;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements TextWatcher {
    public int r;
    public final /* synthetic */ EditText s;
    public final /* synthetic */ TextInputLayout t;

    public u(TextInputLayout textInputLayout, EditText editText) {
        this.t = textInputLayout;
        this.s = editText;
        this.r = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.t;
        textInputLayout.w(!textInputLayout.S0, false);
        if (textInputLayout.C) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.K) {
            textInputLayout.x(editable);
        }
        EditText editText = this.s;
        int lineCount = editText.getLineCount();
        int i = this.r;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.L0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.r = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
