package n9;

import java.io.File;
import r9.n;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29673a;

    public a(boolean z10) {
        this.f29673a = z10;
    }

    @Override // n9.b
    public final String a(Object obj, n nVar) {
        File file = (File) obj;
        if (!this.f29673a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
