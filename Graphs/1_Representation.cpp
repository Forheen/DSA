//C++ program for representation of unweighted undirected graph in matrix form using array
#include<iostream>
using namespace std;
int main(){
    int n,m;
    cin >> n >> m;
    //graph in matrix form
    int adj[n+1][n+1]={0};
    for(int i=0; i<m;i++){
        int u,v;
        cin >> u >> v;
        adj[u][v]=1;
        adj[v][u]=1;
    }
    
    cout << "matrix stored"<<endl;
    for(int j=0; j<=n;j++){
       cout << "  "<<j;
    } 
    for(int i=0; i<=n;i++){
            cout<<endl << i<< " : ";
     for(int j=0; j<=n;j++){
       cout << adj[i][j]<< " ";
    }  
    }
    return 0;
}