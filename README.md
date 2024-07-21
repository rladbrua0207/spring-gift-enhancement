# spring-gift-enhancement

## Step 1
1. 상품 정보에 카테고리 추가
   - 상품을 추가할 때 카테고리 지정 가능
2. 상품 카테고리 수정 
   - 상품 수정 시 카테고리 변경 가능

## Step 2
1. 상품 정보에 옵션 추가
- 상품을 추가할 때 옵션 지정 가능 
- 옵션 이름은 공백을 포함하여 최대 50자까지 입력할 수 있다. 
- 옵션 이름에는 특수 문자 ( ), [ ], +, -, &, /, _ 만 사용 가능하며, 그 외 특수 문자는 사용 불가 
- 옵션 수량은 최소 1개 이상 1억 개 미만이어야 한다. 
- 동일한 상품 내의 옵션 이름은 중복될 수 없다. 

2. 옵션 추가/수정/삭제 기능 구현
- 상품 추가 시 옵션을 함께 추가할 수 있다.
- 상품 수정 시 옵션을 추가/수정/삭제할 수 있다. 

3. 옵션 유효성 검사
- 옵션 이름의 길이와 사용 가능한 특수 문자를 검사한다. 
- 옵션 수량이 유효한 범위 내에 있는지 검사한다. 
- 동일한 상품 내의 옵션 이름이 중복되지 않도록 검사한다.

## Step 3
1. 상품 옵션의 수량 감소 기능 구현
- 수량이 0 이하로 감소하지 않도록 검사한다.
