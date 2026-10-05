package com.google.android.material.timepicker;

import a5.f0;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import q.p;

/* loaded from: /home/user/work/p/classes4.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip r;
    public final EditText s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, com.google.android.material.chip.Chip] */
    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) ((Chip) from.inflate(2131559304, (ViewGroup) this, false));
        this.r = r5;
        r5.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(2131559305, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.s = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(r5);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(2131363005);
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.r.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.s.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        p pVar = this.r;
        pVar.setChecked(z);
        int i = z ? 0 : 4;
        EditText editText = this.s;
        editText.setVisibility(i);
        pVar.setVisibility(z ? 8 : 0);
        if (pVar.isChecked()) {
            editText.requestFocus();
            editText.post(new f0(editText, 1));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.r.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.r.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.r.toggle();
    }
}
