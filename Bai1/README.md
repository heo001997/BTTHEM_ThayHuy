# Bài 1: Remove Duplicate Elements In LinkedList

Em nghĩ ra 3 hướng có thể giải quyết được bài toán, bài em nộp là hướng rắc rối nhất (theo em nghĩ) nhưng cũng tiết kiệm bộ nhớ và tối ưu tốc độ chạy nhất (em nghĩ vậy ạ).

Ý tưởng là em chỉ duyệt phần tử hiện tại và phần tử trước nó, không duyệt đến phần tử sau nó, chỉ lưu lại kết quả (boolean) duyệt cũ  (ngay trước), rồi dựa vào đó để phân loại phần tử sau, nhét nó lại vào linkedlist, rồi in ra như thường.

Mong thầy sẽ refactor lại code giúp em hoặc có thêm góp ý, cảm ơn thầy nhiều ạ.   
