package k51;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class a implements i51.c {
    public final /* synthetic */ int a;

    @Override // i51.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                i51.d dVar = (i51.d) obj2;
                dVar.a(l51.f.g, entry.getKey());
                dVar.a(l51.f.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
