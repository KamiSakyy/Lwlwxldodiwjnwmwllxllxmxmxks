package l51;

import com.google.firebase.encoders.EncodingException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements i51.f {
    public boolean a = false;
    public boolean b = false;
    public i51.b c;
    public final f d;

    public i(f fVar) {
        this.d = fVar;
    }

    @Override // i51.f
    public final i51.f b(String str) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.h(this.c, str, this.b);
        return this;
    }

    @Override // i51.f
    public final i51.f c(boolean z) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }

    public i(Object... a) {
    }
}
