package o71;

import java.util.Random;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a extends d {
    public abstract Random a();

    public final int b(int i) {
        return a().nextInt(i);
    }
}
