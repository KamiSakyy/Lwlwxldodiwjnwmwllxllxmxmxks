package i3;

import com.google.android.gms.internal.measurement.b4;
import java.text.BreakIterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends b4 {

    /* renamed from: x, reason: collision with root package name */
    public BreakIterator f25773x;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f25773x = characterInstance;
    }

    public final int X(int i) {
        return this.f25773x.following(i);
    }

    public final int b0(int i) {
        return this.f25773x.preceding(i);
    }
}
