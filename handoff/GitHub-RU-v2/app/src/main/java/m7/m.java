package m7;

import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import n5.p0;
import n5.s0;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public y1 f29027a;

    public m() {
        this.f29027a = n1.c(s0.f29596b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(do0.q qVar, c71.c cVar) {
        l lVar;
        int i;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f29021w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f29021w = i10 - Integer.MIN_VALUE;
                Object obj = lVar.f29019u;
                b71.a aVar = b71.a.r;
                i = lVar.f29021w;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw new KotlinNothingValueException();
                }
                sy.y.j(obj);
                lVar.f29021w = 1;
                this.f29027a.b(qVar, lVar);
                return;
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f29019u;
        b71.a aVar2 = b71.a.r;
        i = lVar.f29021w;
        if (i == 0) {
        }
    }

    public p0 b() {
        return (p0) this.f29027a.getValue();
    }

    public void c(Set set) {
        y1 y1Var;
        Object value;
        int[] iArr;
        k71.k.g(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        do {
            y1Var = this.f29027a;
            value = y1Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = set.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
        } while (!y1Var.i(value, iArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r6.f29582a > ((n5.c) r2).f29582a) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(p0 p0Var) {
        y1 y1Var;
        Object value;
        p0 p0Var2;
        k71.k.g(p0Var, "newState");
        do {
            y1Var = this.f29027a;
            value = y1Var.getValue();
            p0Var2 = (p0) value;
            if (!(p0Var2 instanceof n5.i0) && !k71.k.b(p0Var2, s0.f29596b)) {
                if (!(p0Var2 instanceof n5.c)) {
                    if (!(p0Var2 instanceof n5.f0)) {
                        if (!(p0Var2 instanceof n5.h0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                }
            }
            p0Var2 = p0Var;
        } while (!y1Var.i(value, p0Var2));
    }

    public m(int i) {
        this.f29027a = n1.c(new int[i]);
    }
}
