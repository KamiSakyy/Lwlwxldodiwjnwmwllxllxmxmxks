package com.github.rudroid.views;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements MultiAutoCompleteTextView.Tokenizer {
    public static final C0020a Companion = new C0020a();

    /* renamed from: com.github.rudroid.views.a$a, reason: collision with other inner class name */
    public static final class C0020a {
    }

    public static boolean a(char c) {
        return Character.isLetterOrDigit(c) || Character.valueOf(c).equals('-') || Character.valueOf(c).equals('/');
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final int findTokenEnd(CharSequence charSequence, int i) {
        k71.k.g(charSequence, "text");
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == ' ' || !a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return length;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final int findTokenStart(CharSequence charSequence, int i) {
        k71.k.g(charSequence, "text");
        int i2 = i;
        while (i2 > 0 && a(charSequence.charAt(i2 - 1))) {
            i2--;
        }
        if (i2 >= 1) {
            int i3 = i2 - 1;
            if (charSequence.charAt(i3) == '@') {
                return i3;
            }
        }
        return i;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final CharSequence terminateToken(CharSequence charSequence) {
        k71.k.g(charSequence, "text");
        int length = charSequence.length();
        while (length > 0 && charSequence.charAt(length - 1) == ' ') {
            length--;
        }
        if (length > 0 && charSequence.charAt(length - 1) == ' ') {
            return charSequence;
        }
        if (!(charSequence instanceof Spanned)) {
            return ((Object) charSequence) + " ";
        }
        SpannableString spannableString = new SpannableString(((Object) charSequence) + " ");
        TextUtils.copySpansFrom((Spanned) charSequence, 0, charSequence.length(), Object.class, spannableString, 0);
        return spannableString;
    }
    public Object ordinal() { return null; }
}
