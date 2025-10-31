#include <stdio.h>

int main(void)
{
    int x = 50;  // x lưu giá trị 50 (trên Stack)
    
    int *p = &x; // p lưu ĐỊA CHỈ bộ nhớ của x
    
    // In ra giá trị của x
    printf("Gia tri cua x: %i\n", x);      // Output: 50
    
    // In ra địa chỉ của x (hoặc giá trị mà p đang lưu)
    printf("Dia chi cua x: %p\n", p);      // Output: 0x7ffee... (một địa chỉ)
    
    // In ra giá trị TẠI địa chỉ mà p đang trỏ tới (Giải tham chiếu)
    printf("Gia tri *p: %i\n", *p);        // Output: 50
    
    return 0;
}