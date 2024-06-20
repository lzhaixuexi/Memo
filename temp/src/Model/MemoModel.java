package Model;

import java.util.ArrayList;
import java.util.List;

public class MemoModel {
    private List<Memo> memos;

    public MemoModel() {
        this.memos = new ArrayList<>();
    }

    public void addMemo(Memo memo) {
        memos.add(memo);
    }

    public void deleteMemo(Memo memo) {
        memos.remove(memo);
    }

    public List<Memo> getMemos() {
        return memos;
    }

    public List<Memo> searchMemos(String keyword) {
        List<Memo> result = new ArrayList<>();
        for (Memo memo : memos) {
            if (memo.getTitle().contains(keyword) || memo.getContent().contains(keyword)) {
                result.add(memo);
            }
        }
        return result;
    }

    public List<Memo> getMemosByDate(String date) {
        List<Memo> result = new ArrayList<>();
        for (Memo memo : memos) {
            if (memo.getDate().equals(date)) {
                result.add(memo);
            }
        }
        return result;
    }
}

