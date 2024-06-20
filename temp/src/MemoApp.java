import Controller.MemoController;
import Model.MemoModel;
import View.MemoView;

import java.util.Scanner;

public class MemoApp {
    public static void main(String[] args) {
        MemoModel model = new MemoModel();
        MemoView view = new MemoView();
        MemoController controller = new MemoController(model, view);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 添加备忘录");
            System.out.println("2. 删除备忘录");
            System.out.println("3. 完成备忘录");
            System.out.println("4. 查找备忘录");
            System.out.println("5. 按日期显示备忘录");
            System.out.println("6. 显示所有备忘录");
            System.out.println("0. 退出");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("输入标题:");
                    String title = scanner.nextLine();
                    System.out.println("输入内容:");
                    String content = scanner.nextLine();
                    System.out.println("输入日期:");
                    String date = scanner.nextLine();
                    controller.addMemo(title, content, date);
                    break;
                case 2:
                    System.out.println("输入标题删除备忘录:");
                    String deleteTitle = scanner.nextLine();
                    controller.deleteMemo(deleteTitle);
                    break;
                case 3:
                    System.out.println("输入标题完成备忘录:");
                    String completeTitle = scanner.nextLine();
                    controller.completeMemo(completeTitle);
                    break;
                case 4:
                    System.out.println("输入关键词搜索备忘录:");
                    String keyword = scanner.nextLine();
                    controller.searchMemos(keyword);
                    break;
                case 5:
                    System.out.println("输入日期显示备忘录:");
                    String searchDate = scanner.nextLine();
                    controller.displayMemosByDate(searchDate);
                    break;
                case 6:
                    controller.displayAllMemos();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效选择");
            }
        }
    }
}
