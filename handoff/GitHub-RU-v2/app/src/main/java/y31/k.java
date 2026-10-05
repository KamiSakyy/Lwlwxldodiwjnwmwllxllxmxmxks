package y31;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        l lVar = this.a;
        j jVar = lVar.M;
        if (lVar.J == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = lVar.J;
        if (editText != null) {
            editText.removeTextChangedListener(jVar);
            if (lVar.J.getOnFocusChangeListener() == lVar.b().e()) {
                lVar.J.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        lVar.J = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jVar);
        }
        lVar.b().l(lVar.J);
        lVar.j(lVar.b());
    }
}
