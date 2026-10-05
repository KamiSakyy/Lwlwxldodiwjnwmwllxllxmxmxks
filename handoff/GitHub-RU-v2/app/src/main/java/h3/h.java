package h3;

import java.text.CharacterIterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements CharacterIterator {

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f25454r;

    /* renamed from: s, reason: collision with root package name */
    public final int f25455s;

    /* renamed from: t, reason: collision with root package name */
    public int f25456t = 0;

    public h(int i, CharSequence charSequence) {
        this.f25454r = charSequence;
        this.f25455s = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f25456t;
        if (i == this.f25455s) {
            return (char) 65535;
        }
        return this.f25454r.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f25456t = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f25455s;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f25456t;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f25455s;
        if (i == 0) {
            this.f25456t = i;
            return (char) 65535;
        }
        int i10 = i - 1;
        this.f25456t = i10;
        return this.f25454r.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f25456t + 1;
        this.f25456t = i;
        int i10 = this.f25455s;
        if (i < i10) {
            return this.f25454r.charAt(i);
        }
        this.f25456t = i10;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f25456t;
        if (i <= 0) {
            return (char) 65535;
        }
        int i10 = i - 1;
        this.f25456t = i10;
        return this.f25454r.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f25455s || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f25456t = i;
        return current();
    }
}
