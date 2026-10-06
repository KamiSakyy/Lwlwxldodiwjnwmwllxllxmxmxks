package y31;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v extends a5.b {
    public TextInputLayout u;

    public v(TextInputLayout textInputLayout) {
        this.u = textInputLayout;
    }

    public final void d(View view, b5.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.a;
        ((a5.b) this).r.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.u;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.M0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        t tVar = textInputLayout.s;
        View view2 = tVar.s;
        if (view2.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(view2);
            accessibilityNodeInfo.setTraversalAfter(view2);
        } else {
            accessibilityNodeInfo.setTraversalAfter(tVar.u);
        }
        if (!isEmpty) {
            fVar.q(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            fVar.q(charSequence);
            if (!z && placeholderText != null) {
                fVar.q(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            fVar.q(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        View view3 = textInputLayout.B.y;
        if (view3 != null) {
            accessibilityNodeInfo.setLabelFor(view3);
        }
        textInputLayout.t.b().m(fVar);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.u.t.b().n(accessibilityEvent);
    }
    public static final Object H = null;
}
