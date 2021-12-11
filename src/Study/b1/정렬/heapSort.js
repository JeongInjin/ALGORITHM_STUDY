const heapArr = [5,3,7,2,4,8,6,1,7];
console.log("시작전 =>", heapArr);
heapSort(heapArr);
const heapSort = (arr) =>{
    let n = arr.length;

    for(let i = Math.floor(n/2-1); i >= 0; i--){
        heapify(arr, n, i);
    }

    for(let i = n-1; i >0; i--){
        swap(arr, 0, i);
        heapify(arr, i, 0);
    }
}
console.log("시작후 =>", heapArr);
// 단순히 일반 배열을 힙으로 구성하는 역할을 한다.
// 자식노드와 부모노드를 비교
// n/2-1 부터 0까지 인덱스가 도는 이유는 부모 노드의 인덱스를 기준으로
// 왼쪽 자식노드(n*2+1), 오른쪽 자식노드(n*2+2) 이기 때문이다.
//부모노드 -> (자식노드인덱스 -1) / 2
const heapify = (arr, n, i) =>{
    let p = i;
    let l = i * 2 + 1;
    let r = i * 2 + 2;

    //left childNode
    //왼쪽자식노드가 인덱스를 안 벗어났으며, 왼쪽 자식노드가 자신의 노드보다 클경우
    //현재 노드와 자식노드와 변경해준다.
    if(l < n && arr[p] < arr[l]){
        p = l;
    }
    //right childNode
    if(r < n && arr[p] < arr[r]){
        p = r;
    }
    if(i !== p){
        swap(arr, i, p);
        heapify(arr, n, p);
    }
}
